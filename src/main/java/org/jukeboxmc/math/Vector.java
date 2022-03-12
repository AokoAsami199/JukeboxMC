package org.jukeboxmc.math;

import lombok.SneakyThrows;
import lombok.ToString;
import org.apache.commons.math3.util.FastMath;
import org.jukeboxmc.world.Dimension;

import java.util.Objects;

/**
 * @author Kaooot, LucGamesYT
 * @version 1.0
 */
@ToString
public class Vector implements Cloneable {

    protected float x;
    protected float y;
    protected float z;
    protected Dimension dimension = Dimension.OVERWORLD;

    public Vector( float x, float y, float z, Dimension dimension ) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dimension = dimension;
    }

    public Vector( int x, int y, int z, Dimension dimension  ) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dimension = dimension;
    }

    public Vector( float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector( int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector zero() {
        return new Vector( 0, 0, 0 );
    }

    public static Vector up() {
        return new Vector( 0, 1, 0 );
    }

    public static Vector down() {
        return new Vector( 0, -1, 0 );
    }

    public static Vector north() {
        return new Vector( 0, 0, -1 );
    }

    public static Vector east() {
        return new Vector( 1, 0, 0 );
    }

    public static Vector south() {
        return new Vector( 0, 0, 1 );
    }

    public static Vector west() {
        return new Vector( -1, 0, 0 );
    }

    public Vector add( final float x, final float y, final float z ) {
        return new Vector( this.x + x, this.y + y, this.z + z, this.dimension );
    }

    public Vector subtract( final float x, final float y, final float z ) {
        return new Vector( this.x - x, this.y - y, this.z - z, this.dimension );
    }

    public Vector multiply( final float x, final float y, final float z ) {
        return new Vector( this.x * x, this.y * y, this.z * z, this.dimension );
    }

    public Vector divide( final float x, final float y, final float z ) {
        return new Vector( this.x / x, this.y / y, this.z / z, this.dimension );
    }

    public Vector squareRoot() {
        return new Vector( (float) FastMath.sqrt( this.x ), (float) FastMath.sqrt( this.y ), (float) FastMath.sqrt( this.z ), this.dimension );
    }

    public Vector cubicRoot() {
        return new Vector( (float) FastMath.cbrt( this.x ), (float) FastMath.cbrt( this.y ), (float) FastMath.cbrt( this.z ), this.dimension );
    }

    public Vector normalize() {
        final float squaredLength = this.squaredLength();

        return this.divide( squaredLength, squaredLength, squaredLength );
    }

    public float distance( final Vector vector ) {
        return (float) Math.sqrt( this.distanceSquared( vector ) );
    }

    public float distanceSquared( final Vector vector ) {
        return (float) ( FastMath.pow( ( this.x - vector.getX() ), 2 ) + FastMath.pow( ( this.y - vector.getY() ), 2 ) +
                FastMath.pow( ( this.z - vector.getZ() ), 2 ) );
    }

    public float squaredLength() {
        return (float) ( FastMath.sqrt( this.x * this.x + this.y * this.y + this.z * this.z ) );
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getZ() {
        return this.z;
    }

    public int getBlockX() {
        return (int) FastMath.floor( this.x );
    }

    public int getBlockY() {
        return (int) FastMath.floor( this.y );
    }

    public int getBlockZ() {
        return (int) FastMath.floor( this.z );
    }

    public void setX( final float x ) {
        this.x = x;
    }

    public void setY( final float y ) {
        this.y = y;
    }

    public void setZ( final float z ) {
        this.z = z;
    }

    public int getChunkX() {
        return this.getBlockX() >> 4;
    }

    public int getChunkZ() {
        return this.getBlockZ() >> 4;
    }

    public Dimension getDimension() {
        return this.dimension;
    }

    public void setDimension( Dimension dimension ) {
        this.dimension = dimension;
    }

    public Vector getVectorWhenXIsOnLine( Vector other, float x ) {
        float xDiff = other.x - this.x;
        float yDiff = other.y - this.y;
        float zDiff = other.z - this.z;

        float f = ( x - this.x ) / xDiff;
        return ( f >= 0F && f <= 1F ) ? new Vector( this.x + xDiff * f, this.y + yDiff * f, this.z + zDiff * f, this.dimension ) : null;
    }

    public Vector getVectorWhenYIsOnLine( Vector other, float y ) {
        float xDiff = other.x - this.x;
        float yDiff = other.y - this.y;
        float zDiff = other.z - this.z;

        float f = ( y - this.y ) / yDiff;
        return ( f >= 0F && f <= 1F ) ? new Vector( this.x + xDiff * f, this.y + yDiff * f, this.z + zDiff * f, this.dimension ) : null;
    }

    public Vector getVectorWhenZIsOnLine( Vector other, float z ) {
        float xDiff = other.x - this.x;
        float yDiff = other.y - this.y;
        float zDiff = other.z - this.z;

        float f = ( z - this.z ) / zDiff;
        return ( f >= 0F && f <= 1F ) ? new Vector( this.x + xDiff * f, this.y + yDiff * f, this.z + zDiff * f, this.dimension ) : null;
    }

    @Override
    @SneakyThrows
    public Vector clone() {
        Vector clone = (Vector) super.clone();
        clone.x = this.x;
        clone.y = this.y;
        clone.z = this.z;
        return clone;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Vector vector = (Vector) o;
        return Float.compare( vector.x, this.x ) == 0 && Float.compare( vector.y, this.y ) == 0 && Float.compare( vector.z, this.z ) == 0 && this.dimension == vector.dimension;
    }

    @Override
    public int hashCode() {
        return Objects.hash( this.x, this.y, this.z, this.dimension );
    }
}