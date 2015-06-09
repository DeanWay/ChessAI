package locations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static locations.LocationTranslator.translate;


/**
 * Created by Dean on 2015-06-08.
 */
public class LocationTranslatorTest
{

    @Test
    public void translateMakesCorrectLocations()
    {
        Assert.assertEquals(new Location(0, 0), translate("a1"));
        Assert.assertEquals(new Location(0, 0), translate("A1"));
        Assert.assertEquals(new Location(7, 7), translate("h8"));
        Assert.assertEquals(new Location(3, 4), translate("e4"));
        Assert.assertEquals(new Location(7, 5), translate("F8"));
    }

    @Test
    public void translateReturnsNullOnInvalidStrings()
    {
        Assert.assertNull(translate("A,2"));
        Assert.assertNull(translate("4e"));
        Assert.assertNull(translate("a 1"));
        Assert.assertNull(translate("e4 NONSENSE_TEXT"));
        Assert.assertNull(translate("e4NONSENSE_TEXT"));
    }
}
