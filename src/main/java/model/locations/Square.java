package model.locations;

/**
 * Created by Dean on 2015-06-10.
 */
public class Square extends Location
{
    public Square(int row, int col)
    {
        super(row, col);
    }

    public Square(String location) throws InvalidLocationStringException
    {
        super(location);
    }
}
