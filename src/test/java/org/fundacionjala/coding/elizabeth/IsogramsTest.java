package org.fundacionjala.coding.elizabeth;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * Defines Isograms tests.
 */
public class IsogramsTest {

    /**
     * Test word with no repeating letters.
     */
    @Test
    public void testWordWithNoRepeatingLetters() {
        Isograms isograma = new Isograms();
        String input = "Dermatoglyphics";
        assertTrue(isograma.isIsogram(input));
    }

    /**
     * Test word with repeating letters.
     */
    @Test
    public void testWordWithRepeatingLetters() {
        Isograms isograma = new Isograms();
        String input = "aba";
        assertFalse(isograma.isIsogram(input));
    }

    /**
     * Test empty string.
     */
    @Test
    public void testEmptyString() {
        Isograms isograma = new Isograms();
        String input = "";
        assertTrue(isograma.isIsogram(input));
    }

    /**
     * Test word with repeating letters.
     */
    @Test
    public void testWordWithRepeatingLettersCase() {
        Isograms isograma = new Isograms();
        String input = "moOse";
        assertFalse(isograma.isIsogram(input));
    }
}
