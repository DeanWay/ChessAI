package model.pieces;

import model.locations.InvalidLocationStringException;

/**
 * Created by Dean on 2015-06-07.
 */
public class Queen extends Piece
{

    public Queen(String location, Color color) throws InvalidLocationStringException
    {
        super(location, color);
        if(color == Color.WHITE){
            this.setUnicodeImage(0x2655);
        } else {
            this.setUnicodeImage(0x265B);
        }
    }
}
