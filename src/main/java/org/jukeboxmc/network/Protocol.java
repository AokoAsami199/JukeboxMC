package org.jukeboxmc.network;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public interface Protocol {

    int PROTOCOL = 422;
    String MINECRAFT_VERSION = "1.16.200";

    //Minecraft
    int BATCH_PACKET = 0xfe;
    byte LOGIN_PACKET = 0x01;
    byte PLAY_STATUS_PACKET = 0x02;
    byte RESOURCE_PACKS_INFO_PACKET = 0x06;
    byte RESOURCE_PACK_STACK_PACKET = 0x07;
    byte RESOURCE_PACK_RESPONSE_PACKET = 0x08;

    //Raknet
    byte CONNECTED_PING = 0x00;
    byte UNCONNECTED_PING = 0x01;
    byte UNCONNECTED_PONG = 0x1c;
    byte CONNECTED_PONG = 0x03;
    byte OPEN_CONNECTION_REQUEST_1 = 0x05;
    byte OPEN_CONNECTION_REPLY_1 = 0x06;
    byte OPEN_CONNECTION_REQUEST_2 = 0x07;
    byte OPEN_CONNECTION_REPLY_2 = 0x08;
    byte CONNECTION_REQUEST = 0x09;
    byte CONNECTION_REQUEST_ACCEPTED = 0x10;
    byte NEW_INCOMING_CONNECTION = 0x13;
    byte DISCONNECT_NOTIFICATION = 0x15;
    byte INCOMPATIBLE_PROTOCOL_VERSION = 0x19;

    byte ACKNOWLEDGE_PACKET = (byte) 0xc0;
    byte NACKNOWLEDGE_PACKET = (byte) 0xa0;
    byte QUERY = (byte) 0xfe;

}
