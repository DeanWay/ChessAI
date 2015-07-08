package model.pieces;

import model.locations.InvalidLocationStringException;

/**
 * Created by Dean on 2015-06-07.
 */
public class King extends Piece
{

    private boolean is_alive;

    public King(String location, Color color) throws InvalidLocationStringException
    {
        super(location, color);
        if(color == Color.WHITE){
            this.setUnicodeImage(0x2654);
        } else {
            this.setUnicodeImage(0x265A);
        }
        this.is_alive = true;
    }

    public boolean isAlive()
    {
        return this.is_alive;
    }

    public void hasDied()
    {
        this.is_alive = false;
    }
}
