package org.jukeboxmc.inventory.transaction;

import org.jukeboxmc.event.inventory.InventoryClickEvent;
import org.jukeboxmc.inventory.Inventory;
import org.jukeboxmc.inventory.transaction.action.SlotChangeAction;
import org.jukeboxmc.item.Item;
import org.jukeboxmc.item.ItemType;
import org.jukeboxmc.player.Player;

import java.util.*;

/**
 * @author CreeperFace
 * @version 1.0
 */
public class InventoryTransaction {

    private long creationTime;
    protected boolean hasExecuted;

    protected Player source;

    protected Set<Inventory> inventories = new HashSet<>();

    protected List<InventoryAction> actions = new ArrayList<>();

    public InventoryTransaction( Player source, List<InventoryAction> actions ) {
        this( source, actions, true );
    }

    public InventoryTransaction( Player source, List<InventoryAction> actions, boolean init ) {
        if ( init ) {
            init( source, actions );
        }
    }

    protected void init( Player source, List<InventoryAction> actions ) {
        creationTime = System.currentTimeMillis();
        this.source = source;

        for ( InventoryAction action : actions ) {
            this.addAction( action );
        }
    }

    public Player getSource() {
        return source;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public Set<Inventory> getInventories() {
        return inventories;
    }

    public List<InventoryAction> getActionList() {
        return actions;
    }

    public Set<InventoryAction> getActions() {
        return new HashSet<>( actions );
    }

    public void addAction( InventoryAction action ) {
        if ( action instanceof SlotChangeAction ) {
            SlotChangeAction slotChangeAction = (SlotChangeAction) action;

            ListIterator<InventoryAction> iterator = this.actions.listIterator();

            while ( iterator.hasNext() ) {
                InventoryAction existingAction = iterator.next();
                if ( existingAction instanceof SlotChangeAction ) {
                    SlotChangeAction existingSlotChangeAction = (SlotChangeAction) existingAction;
                    if ( !existingSlotChangeAction.getInventory().equals( slotChangeAction.getInventory() ) )
                        continue;
                    Item existingSource = existingSlotChangeAction.getSourceItem();
                    Item existingTarget = existingSlotChangeAction.getTargetItem();
                    if ( existingSlotChangeAction.getSlot() == slotChangeAction.getSlot()
                            && slotChangeAction.getSourceItem().equals( existingTarget ) ) {
                        iterator.set( new SlotChangeAction( existingSlotChangeAction.getInventory(), existingSlotChangeAction.getSlot(), existingSlotChangeAction.getSourceItem(), slotChangeAction.getTargetItem() ) );
                        action.onAddToTransaction( this );
                        return;
                    } else if ( existingSlotChangeAction.getSlot() == slotChangeAction.getSlot()
                            && slotChangeAction.getSourceItem().equals( existingSource )
                            && slotChangeAction.getTargetItem().equals( existingTarget ) ) {
                        existingSource.setAmount( existingSource.getAmount() + slotChangeAction.getSourceItem().getAmount() );
                        existingTarget.setAmount( existingTarget.getAmount() + slotChangeAction.getTargetItem().getAmount() );
                        iterator.set( new SlotChangeAction( existingSlotChangeAction.getInventory(), existingSlotChangeAction.getSlot(), existingSource, existingTarget ) );
                        return;
                    }
                }
            }
        }
        this.actions.add( action );
        action.onAddToTransaction( this );
    }

    /**
     * This method should not be used by plugins, it's used to add tracked inventories for InventoryActions
     * involving inventories.
     *
     * @param inventory to add
     */
    public void addInventory( Inventory inventory ) {
        this.inventories.add( inventory );
    }

    protected boolean matchItems( List<Item> needItems, List<Item> haveItems ) {
        for ( InventoryAction action : this.actions ) {
            if ( action.getTargetItem().getItemType() != ItemType.AIR ) {
                needItems.add( action.getTargetItem() );
            }

            if ( !action.isValid( this.source ) ) {
                return false;
            }

            if ( action.getSourceItem().getItemType() != ItemType.AIR ) {
                haveItems.add( action.getSourceItem() );
            }
        }

        for ( Item needItem : new ArrayList<>( needItems ) ) {
            for ( Item haveItem : new ArrayList<>( haveItems ) ) {
                if ( needItem.equals( haveItem ) ) {
                    int amount = Math.min( haveItem.getAmount(), needItem.getAmount() );
                    needItem.setAmount( needItem.getAmount() - amount );
                    haveItem.setAmount( haveItem.getAmount() - amount );
                    if ( haveItem.getAmount() == 0 ) {
                        haveItems.remove( haveItem );
                    }
                    if ( needItem.getAmount() == 0 ) {
                        needItems.remove( needItem );
                        break;
                    }
                }
            }
        }

        return haveItems.isEmpty() && needItems.isEmpty();
    }

    protected void sendInventories() {
        for ( InventoryAction action : this.actions ) {
            if ( action instanceof SlotChangeAction ) {
                SlotChangeAction sca = (SlotChangeAction) action;

                sca.getInventory().sendContents( sca.getSlot(), this.source );
            }
        }
    }

    public boolean canExecute() {
        List<Item> haveItems = new ArrayList<>();
        List<Item> needItems = new ArrayList<>();
        boolean matchItems = matchItems( needItems, haveItems );
        return matchItems && this.actions.size() > 0 && haveItems.size() == 0 && needItems.size() == 0;
    }

    protected boolean callExecuteEvent() {
        SlotChangeAction from = null;
        SlotChangeAction to = null;
        Player who = null;

        for ( InventoryAction action : this.actions ) {
            if ( !( action instanceof SlotChangeAction ) ) {
                continue;
            }
            SlotChangeAction slotChange = (SlotChangeAction) action;

            if ( slotChange.getInventory().getInventoryHolder() instanceof Player ) {
                who = (Player) slotChange.getInventory().getInventoryHolder();
            }

            if ( from == null ) {
                from = slotChange;
            } else {
                to = slotChange;
            }
        }

        if ( who != null && to != null ) {
            if ( from.getTargetItem().getAmount() > from.getSourceItem().getAmount() ) {
                from = to;
            }

            InventoryClickEvent ev2 = new InventoryClickEvent( from.getInventory(), who, from.getSourceItem(), from.getTargetItem(), from.getSlot() );
            this.source.getServer().getPluginManager().callEvent( ev2 );

            if ( ev2.isCancelled() ) {
                return false;
            }
        }

        return true;
    }

    public boolean execute() {
        if ( this.hasExecuted() || !this.canExecute() ) {
            this.sendInventories();
            return false;
        }

        if ( !callExecuteEvent() ) {
            this.sendInventories();
            return true;
        }

        for ( InventoryAction action : this.actions ) {
            if ( !action.onPreExecute( this.source ) ) {
                this.sendInventories();
                return true;
            }
        }

        for ( InventoryAction action : this.actions ) {
            if ( action.execute( this.source ) ) {
                action.onExecuteSuccess( this.source );
            } else {
                action.onExecuteFail( this.source );
            }
        }

        this.hasExecuted = true;
        return true;
    }

    public boolean hasExecuted() {
        return this.hasExecuted;
    }

}
