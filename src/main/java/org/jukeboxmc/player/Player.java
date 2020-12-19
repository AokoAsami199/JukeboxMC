package org.jukeboxmc.player;

import lombok.Getter;
import lombok.Setter;
import org.jukeboxmc.Server;
import org.jukeboxmc.math.Location;
import org.jukeboxmc.network.packet.TextPacket;
import org.jukeboxmc.network.raknet.Connection;
import org.jukeboxmc.player.info.DeviceInfo;
import org.jukeboxmc.player.skin.Skin;
import org.jukeboxmc.world.World;

import java.net.InetSocketAddress;
import java.util.Locale;
import java.util.UUID;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class Player {

    private String name;
    private String xuid;
    private UUID uuid;
    private Skin skin;

    public static long entityCount = 1;

    private long entityId = 0;

    private float headYaw;

    private int viewDistance = 16;

    private boolean isOnGround;
    @Getter @Setter
    private boolean isSpawned;

    private Locale locale;
    private Location location;

    private Server server;
    private DeviceInfo deviceInfo;
    private InetSocketAddress address;
    private PlayerConnection playerConnection;

    public Player( Server server, Connection connection ) {
        this.server = server;
        this.location = new Location( server.getDefaultWorld(), 0, 10, 0, 0, 0 );
        this.address = connection.getSender();
        this.playerConnection = new PlayerConnection( this, connection );
    }

    public String getName() {
        return this.name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getXuid() {
        return this.xuid;
    }

    public void setXuid( String xuid ) {
        this.xuid = xuid;
    }

    public UUID getUUID() {
        return this.uuid;
    }

    public void setUUID( UUID uuid ) {
        this.uuid = uuid;
    }

    public Skin getSkin() {
        return this.skin;
    }

    public void setSkin( Skin skin ) {
        this.skin = skin;
    }

    public boolean isOnGround() {
        return isOnGround;
    }

    public void setOnGround( boolean onGround ) {
        isOnGround = onGround;
    }

    public void setLocale( Locale locale ) {
        this.locale = locale;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public Location getLocation() {
        return this.location;
    }

    public World getWorld() {
        return this.location.getWorld();
    }

    public float getX() {
        return this.getLocation().getX();
    }

    public int getFloorX() {
        return (int) Math.floor( this.getLocation().getX() );
    }

    public float getY() {
        return this.location.getY();
    }

    public int getFloorY() {
        return (int) Math.floor( this.getLocation().getY() );
    }

    public float getZ() {
        return this.location.getZ();
    }

    public int getFloorZ() {
        return (int) Math.floor( this.getLocation().getZ() );
    }

    public float getYaw() {
        return this.location.getYaw();
    }

    public float getPitch() {
        return this.location.getPitch();
    }

    public int getChunkX() {
        return (int) this.location.getX() >> 4;
    }

    public int getChunkZ() {
        return (int) this.location.getZ() >> 4;
    }

    public void setLocation( Location location ) {
        this.location = location;
    }

    public Server getServer() {
        return this.server;
    }

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public void setDeviceInfo( DeviceInfo deviceInfo ) {
        this.deviceInfo = deviceInfo;
    }

    public InetSocketAddress getAddress() {
        return this.address;
    }

    public PlayerConnection getPlayerConnection() {
        return this.playerConnection;
    }

    public void setPlayerConnection( PlayerConnection playerConnection ) {
        this.playerConnection = playerConnection;
    }

    public long getEntityId() {
        return this.entityId;
    }

    public void setEntityId( long entityId ) {
        this.entityId = entityId;
    }

    public float getHeadYaw() {
        return this.headYaw;
    }

    public void setAddress( InetSocketAddress address ) {
        this.address = address;
    }

    //Other

    public int getViewDistance() {
        return this.viewDistance;
    }

    public void setViewDistance( int viewDistance ) {
        this.viewDistance = viewDistance;
        this.playerConnection.setViewDistance( viewDistance );
    }

    public void disconnect( String message ) {
        this.playerConnection.disconnect( message );
    }

    public void sendMessage( String message ) {
        this.playerConnection.sendMessage( message, TextPacket.Type.RAW );
    }

    public void sendTip( String message ) {
        this.playerConnection.sendMessage( message, TextPacket.Type.TIP );
    }
}
