package model.locations;

import org.junit.Assert;
import org.junit.Test;

import static model.locations.LocationTranslator.translate;
import static model.locations.LocationTranslator.locationToString;


/**
 * Created by Dean on 2015-06-08.
 */
public class LocationTranslatorTest
{

    @Test
    public void translateMakesCorrectLocations() throws InvalidLocationStringException
    {
        Assert.assertEquals(new Location(0, 0), translate("a1"));
        Assert.assertEquals(new Location(0, 0), translate("A1"));
        Assert.assertEquals(new Location(7, 7), translate("h8"));
        Assert.assertEquals(new Location(3, 4), translate("e4"));
        Assert.assertEquals(new Location(7, 5), translate("F8"));
    }

    @Test
    public void translateMakesCorrectString()
    {
        Assert.assertEquals("a1", locationToString(0, 0));
        Assert.assertEquals("h8", locationToString(7, 7));
        Assert.assertEquals("e4", locationToString(3, 4));
        Assert.assertEquals("f8", locationToString(7, 5));
    }

    @Test(expected = InvalidLocationStringException.class)
    public void translateThrowsExceptionStingWithComma() throws InvalidLocationStringException
    {
        translate("A,2");
    }

    @Test(expected = InvalidLocationStringException.class)
    public void translateThrowsExceptionStringWithSpace() throws InvalidLocationStringException
    {
        translate("a 1");
    }

    @Test(expected = InvalidLocationStringException.class)
    public void translateThrowsExceptionWithEmptyString() throws InvalidLocationStringException
    {
        translate("");
    }

    @Test(expected = InvalidLocationStringException.class)
    public void translateThrowsExceptionWithStringLengthOne() throws InvalidLocationStringException
    {
        translate("a");
    }

    @Test(expected = InvalidLocationStringException.class)
    public void translateThrowsExceptionStringWithWrongOrder() throws InvalidLocationStringException
    {
        translate("2a");
    }

    @Test(expected = InvalidLocationStringException.class)
    public void translateThrowsExceptionWithStringTooLong() throws InvalidLocationStringException
    {
        translate("e4NONSENSE_TEXT");
    }
}
