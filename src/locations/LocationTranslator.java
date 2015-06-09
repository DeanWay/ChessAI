package locations;

/**
 * Created by Dean on 2015-06-08.
 */
public class LocationTranslator
{
    public static Location translate(String location){
        if(location.length() > 2){
            return null;
        }
        int row = -1, col = -1;
        switch(location.toLowerCase().charAt(0)){
            case 'a': col = 0;
                break;
            case 'b': col = 1;
                break;
            case 'c': col = 2;
                break;
            case 'd': col = 3;
                break;
            case 'e': col = 4;
                break;
            case 'f': col = 5;
                break;
            case 'g': col = 6;
                break;
            case 'h': col = 7;
                break;
        }
        switch(location.toLowerCase().charAt(1)){
            case '1': row = 0;
                break;
            case '2': row = 1;
                break;
            case '3': row = 2;
                break;
            case '4': row = 3;
                break;
            case '5': row = 4;
                break;
            case '6': row = 5;
                break;
            case '7': row = 6;
                break;
            case '8': row = 7;
                break;
        }
        if(row == -1 || col == -1){
            return null;
        }
        return new Location(row, col);
    }

    public static SquareColor getSquareColor(Location location){
        if((location.getColIntVal() % 2 == 0 && location.getRowIntVal() % 2 == 0)
                || (location.getColIntVal() % 2 ==1 && location.getRowIntVal() % 2 == 1)){
            return SquareColor.LIGHT_SQUARE;
        }
        else{
            return SquareColor.DARK_SQUARE;
        }
    }
}
