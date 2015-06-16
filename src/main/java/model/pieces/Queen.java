package model.pieces;

/**
 * Created by Dean on 2015-06-07.
 */
public class Queen extends Piece
{

    public Queen(String location, Color color)
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
