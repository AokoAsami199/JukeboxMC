package org.jukeboxmc.world.generator;

import org.jukeboxmc.math.Vector;
import org.jukeboxmc.world.Dimension;
import org.jukeboxmc.world.World;
import org.jukeboxmc.world.chunk.Chunk;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class EmptyGenerator extends WorldGenerator {

    private World world;

    @Override
    public Chunk generate( int chunkX, int chunkZ, Dimension dimension ) {
        return new Chunk( this.world, chunkX, chunkZ, dimension );
    }

    @Override
    public Vector getSpawnLocation() {
        return new Vector( 0, 64, 0 );
    }

    @Override
    public void populate( Chunk chunk ) {

    }

    @Override
    public void setWorld( World world ) {
        this.world = world;
    }


}
