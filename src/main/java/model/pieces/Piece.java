package model.pieces;

import model.locations.Location;
import model.locations.LocationTranslator;

import java.awt.*;

/**
 * Created by Dean on 2015-06-07.
 */
public abstract class Piece
{

    private Location location;
    private Color color;
    private Image image;

    public Piece(String location, Color color)
    {
        this.location = LocationTranslator.translate(location);
        this.color = color;
        this.image = null;
    }

    public Piece(String location, Color color, Image image){
        this.location = LocationTranslator.translate(location);
        this.color = color;
        this.image = image;
    }

    public Location getLocation(){
        return location;
    }

    public String getLocationAsString()
    {
        return LocationTranslator.locationToString(this.location);
    }

    public boolean move(String moveTo){
        this.location = LocationTranslator.translate(moveTo);
        return true;
    }
}
