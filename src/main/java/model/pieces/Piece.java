package model.pieces;

import model.locations.InvalidLocationStringException;
import model.locations.Location;
import model.locations.LocationTranslator;

import java.awt.Image;

/**
 * Created by Dean on 2015-06-07.
 */
public abstract class Piece
{

    private Location location;
    private Color color;
    private Image image;
    private char unicodeImage;

    public Piece(String location, Color color) throws InvalidLocationStringException
    {
        this.location = LocationTranslator.translate(location);
        this.color = color;
        this.image = null;
    }

    public Piece(String location, Color color, Image image) throws InvalidLocationStringException
    {
        this.location = LocationTranslator.translate(location);
        this.color = color;
        this.image = image;
    }

    protected void setUnicodeImage(int unicodeHex){
        if(Character.isDefined(unicodeHex)){
            char[] unicode = Character.toChars(unicodeHex);
            this.unicodeImage = unicode[0];
        }
    }

    public char getUnicodeImage(){
        return this.unicodeImage;
    }

    public Location getLocation(){
        return location;
    }

    public String getLocationAsString()
    {
        return LocationTranslator.locationToString(this.location);
    }

    public boolean move(String moveTo) throws InvalidLocationStringException
    {
        this.location = LocationTranslator.translate(moveTo);
        return true;
    }
}
