package model.pieces;

/**
 * Created by Dean on 2015-06-07.
 */
public class Pawn extends Piece
{

    public Pawn(String location, Color color)
    {
        super(location, color);
    }

    @Override
    public boolean move()
    {
        return false;
    }

    @Override
    public boolean isLegalMove()
    {
        return false;
    }
}
