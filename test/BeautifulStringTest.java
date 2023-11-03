import chapterSix.BeautifulStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeautifulStringTest {


    @Test
    public void fullStopCanBeAddedToEndOfAStringTest() {
        String result = BeautifulStrings.addFullStopto("Philips");
        assertEquals("Philips.", result);

    }

    @Test
    public void capitaliseFirstLetterIn() {
        String result = BeautifulStrings.capitalizeFirstLetterIn("philips");
        assertEquals("Philips", result);
    }

    @Test
    public void stringsAreBeautifiedTest() {
        String result = BeautifulStrings.beautify("I am a corper");
        assertEquals("I am a corper.", result);
    }
}