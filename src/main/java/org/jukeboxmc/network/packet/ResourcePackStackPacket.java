package org.jukeboxmc.network.packet;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.jukeboxmc.Server;
import org.jukeboxmc.resourcepack.ResourcePack;
import org.jukeboxmc.utils.BinaryStream;
import org.jukeboxmc.utils.MultiProtocolUtil;

import java.util.Collection;

/**
 * @author LucGamesYT
 * @version 1.0
 */
@Data
@EqualsAndHashCode ( callSuper = true )
public class ResourcePackStackPacket extends Packet {

    private boolean mustAccept;

    @Override
    public int getPacketId() {
        return Protocol.RESOURCE_PACK_STACK_PACKET;
    }

    @Override
    public void write( BinaryStream stream ) {
        super.write(stream);

        stream.writeBoolean( this.mustAccept );

        //Behavior packs
        stream.writeUnsignedVarInt( 0 );

        Collection<ResourcePack> resourcePacks = Server.getInstance().getResourcePackManager().retrieveResourcePacks();

        stream.writeUnsignedVarInt( resourcePacks.size() );
        for ( ResourcePack resourcePack : resourcePacks ) {
            stream.writeString( resourcePack.getUuid() );
            stream.writeString( resourcePack.getVersion() );
            stream.writeString( "" );
        }

        MultiProtocolUtil.getMinecraftVersionByProtocol( this.protocolVersion ).ifPresent( stream::writeString );
        // length of experimental data
        stream.writeInt( 0 );

        // experiments previously toggled
        stream.writeBoolean( false );
    }
}
