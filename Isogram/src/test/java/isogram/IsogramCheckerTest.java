package isogram;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsogramCheckerTest {
    private IsogramChecker iso;

    @Before
    public void setUp() {
         iso = new IsogramChecker();
    }

    @Test
    public void testEmptyString() {
        assertTrue(iso.isIsogram(""));
    }

    @Test
    public void testLowercaseIsogram() {
        assertTrue(iso.isIsogram("isogram"));
    }

    @Test
    public void testNotIsogram() {
        assertFalse(iso.isIsogram("eleven"));
    }

    @Test
    public void testMediumLongIsogram() {
        assertTrue(iso.isIsogram("subdermatoglyphic"));
    }

    @Test
    public void testCaseInsensitive() {
        assertFalse(iso.isIsogram("Alphabet"));
    }

    @Test
    public void testIsogramWithHyphen() {
        assertTrue(iso.isIsogram("thumbscrew-japingly"));
    }

    @Test
    public void testIsogramWithDuplicatedHyphen() {
        assertTrue(iso.isIsogram("six-year-old"));
    }

    @Test
    public void testMadeUpNameThatIsAnIsogram() {
        assertTrue(iso.isIsogram("Emily Jung Schwartzkopf"));
    }

    @Test
    public void testDuplicatedCharacterInTheMiddleIsNotIsogram() {
        assertFalse(iso.isIsogram("accentor"));
    }

}
