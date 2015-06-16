package model.pieces;

/**
 * Created by Dean on 2015-06-07.
 */
public class Bishop extends Piece
{

    public Bishop(String location, Color color)
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
