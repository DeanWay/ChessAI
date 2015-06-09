package locations;

/**
 * Created by Dean on 2015-06-08.
 */
public class Location
{
    int row_int;
    int col_int;

    public Location(String location){
        Location loc = LocationTranslator.translate(location);
        this.col_int = loc.getColIntVal();
        this.row_int = loc.getRowIntVal();
    }

    public Location(int row, int col){
        this.row_int = row;
        this.col_int = col;
    }

    public int getColIntVal(){
        return this.col_int;
    }

    public int getRowIntVal(){
        return this.row_int;
    }

    @Override
    public boolean equals(Object other){
        if(other == null){
            return false;
        }
        if(other.getClass() != Location.class){
            return false;
        }
        Location otherLocation = (Location)other;
        if(otherLocation.getColIntVal() == this.getColIntVal() &&
                otherLocation.getRowIntVal() == this.getRowIntVal()){
            return true;
        }
        return false;
    }
}
