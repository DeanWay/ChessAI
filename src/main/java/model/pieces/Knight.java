package model.pieces;

import model.locations.InvalidLocationStringException;

/**
 * Created by Dean on 2015-06-07.
 */
public class Knight extends Piece
{

    public Knight(String location, Color color) throws InvalidLocationStringException
    {
        super(location, color);
    }
}
