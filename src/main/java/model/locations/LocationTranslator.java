package model.locations;

/**
 * Created by Dean on 2015-06-08.
 */
public class LocationTranslator
{
    public static Location translate(String location) throws InvalidLocationStringException
    {
        if(location.length() != 2)
        {
            throw new InvalidLocationStringException("LocationTranslator.translate(String) was passed "
                + "an invalid String: " + location);
        }
        int row = -1, col = -1;
        switch(location.toLowerCase().charAt(0))
        {
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
        switch(location.toLowerCase().charAt(1))
        {
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
        if(row == -1 || col == -1)
        {
            throw new InvalidLocationStringException("LocationTranslator.translate(String) was passed "
                + "an invalid String: " + location);
        }
        return new Location(row, col);
    }

    public static String locationToString(Location location){
        return locationToString(location.getRowIntVal(), location.getColIntVal());
    }

    public static String locationToString(int row, int col)
    {
        StringBuilder sb = new StringBuilder();
        switch (col){
            case 0: sb.append("a");
                break;
            case 1: sb.append("b");
                break;
            case 2: sb.append("c");
                break;
            case 3: sb.append("d");
                break;
            case 4: sb.append("e");
                break;
            case 5: sb.append("f");
                break;
            case 6: sb.append("g");
                break;
            case 7: sb.append("h");
                break;
        }
        row += 1;
        sb.append(row);
        return sb.toString();
    }

    public static SquareColor getSquareColor(Location location)
    {
        if((location.getColIntVal() % 2 == 0 && location.getRowIntVal() % 2 == 0)
                || (location.getColIntVal() % 2 ==1 && location.getRowIntVal() % 2 == 1))
        {
            return SquareColor.LIGHT_SQUARE;
        }
        else
        {
            return SquareColor.DARK_SQUARE;
        }
    }
}
