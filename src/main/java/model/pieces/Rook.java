package model.pieces;

import model.locations.InvalidLocationStringException;

/**
 * Created by Dean on 2015-06-07.
 */
public class Rook extends Piece
{

    public Rook(String location, Color color) throws InvalidLocationStringException
    {
        super(location, color);
    }
}
