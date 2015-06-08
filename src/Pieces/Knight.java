package Pieces;

/**
 * Created by Dean on 2015-06-07.
 */
public class Knight extends Piece {

    public Knight(String location, Color color){
        super(location, color);
    }

    @Override
    public boolean move() {
        return false;
    }

    @Override
    public boolean isLegalMove() {
        return false;
    }
}
