package proverb;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProverbBuilderTest {
    private static final String LAST_LINE = "And all for the want of a nail.";
    private static final String FIRST_LINE = "For want of a nail the shoe was lost.\n";

    @Test
    public void zeroWordsAreGiven() {
        String[] words = new String[0];
        String proverb = new ProverbBuilder(words).recite();
        String expected = "";

        assertThat(proverb, is(expected));
    }

    @Test
    public void singlePieceOfProverb() {
        String[] words = new String[]{"nail"};
        String proverb = new ProverbBuilder(words).recite();

        assertThat(proverb, is(LAST_LINE));
    }

    @Test
    public void twoPiecesOfProverb() {
        String[] words = new String[]{"nail", "shoe"};
        String proverb = new ProverbBuilder(words).recite();
        String expected = FIRST_LINE + LAST_LINE;

        assertThat(proverb, is(expected));
    }

    @Test
    public void shortChainOfConsequences() {
        String[] words = new String[]{"nail", "shoe", "horse"};
        String proverb = new ProverbBuilder(words).recite();
        String expected = FIRST_LINE + "For want of a shoe the horse was lost.\n" + LAST_LINE;

        assertThat(proverb, is(expected));
    }

    @Test
    public void fullProverb() {
        String[] words = new String[]{"nail", "shoe", "horse", "rider", "message", "battle", "kingdom"};
        String proverb = new ProverbBuilder(words).recite();
        String expected = FIRST_LINE +
                "For want of a shoe the horse was lost.\n" +
                "For want of a horse the rider was lost.\n" +
                "For want of a rider the message was lost.\n" +
                "For want of a message the battle was lost.\n" +
                "For want of a battle the kingdom was lost.\n" +
                LAST_LINE;

        assertThat(proverb, is(expected));
    }

    @Test
    public void fourPiecesModernizedProverb() {
        String[] words = new String[]{"pin", "gun", "soldier", "battle"};
        String proverb = new ProverbBuilder(words).recite();
        String expected = "For want of a pin the gun was lost.\n" +
                "For want of a gun the soldier was lost.\n" +
                "For want of a soldier the battle was lost.\n" +
                "And all for the want of a pin.";

        assertThat(proverb, is(expected));
    }

}