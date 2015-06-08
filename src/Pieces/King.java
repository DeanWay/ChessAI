package Pieces;

/**
 * Created by Dean on 2015-06-07.
 */
public class King extends Piece {

    private boolean isAlive;

    public King(String location, Color color){
        super(location, color);
        this.isAlive = true;
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
