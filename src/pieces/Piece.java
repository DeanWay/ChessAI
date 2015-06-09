package pieces;

/**
 * Created by Dean on 2015-06-07.
 */
public abstract class Piece {

    private String location;
    private Color color;

    public Piece(String location, Color color){
        this.location = location;
        this.color = color;
    }

    public String getLocation(){
        return this.location;
    }

    public abstract boolean move();

    public abstract boolean isLegalMove();

}
