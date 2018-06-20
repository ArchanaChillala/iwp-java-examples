package numerals;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class UtilsTest {
    private Utils utils = new Utils();

    @Test
    public void shouldReturnASingleDigit() {
        assertEquals(asList(2), utils.getPlaceValueList(2));
    }

    @Test
    public void shouldReturnUnitsPlaceAsLastElementInInArray() {
        assertEquals(asList(2, 3), utils.getPlaceValueList(23));
    }

    @Test
    public void shouldReturnAllPlaceValuesAsArray() {
        assertEquals(asList(2, 3, 5), utils.getPlaceValueList(235));
    }
}
