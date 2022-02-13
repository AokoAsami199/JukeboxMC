package org.jukeboxmc.utils;

import org.jukeboxmc.network.packet.Protocol;

import java.util.Map;
import java.util.Optional;

/**
 * @author Kaooot
 * @version 1.0
 */
public class MultiProtocolUtil {

    public static Optional<String> getMinecraftVersionByProtocol( int protocol ) {
        return Optional.of( Protocol.SUPPORTED_PROTOCOL_VERSIONS.get( protocol ) );
    }

    public static Optional<Integer> getProtocolByMinecraftVersion( String minecraftVersion ) {
        for ( Map.Entry<Integer, String> entry : Protocol.SUPPORTED_PROTOCOL_VERSIONS.entrySet() ) {
            if ( entry.getValue().equalsIgnoreCase( minecraftVersion ) ||
                    entry.getValue().replaceAll( "\\.", "_" ).equalsIgnoreCase( minecraftVersion ) ) {
                return Optional.of( entry.getKey() );
            }
        }

        return Optional.empty();
    }
}