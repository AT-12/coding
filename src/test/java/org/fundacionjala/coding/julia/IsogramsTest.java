package org.fundacionjala.coding.julia;

import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsogramsTest {
    /**
     * isogram class.
     */
    private Isograms isograms = new Isograms();

    /**
     * the empty string is an isogram.
     */
    @Test
    public void testEmptyWordIsIsogram() {
        String input = "";
        assertTrue(isograms.isIsograms(input));
    }
    /**
     * true if has not repeating letters, consecutive or non-consecutive.
     */
    @Test
    public void testReturnTrueIfHasNoRepeatingLetters() {
        String input = "Dermatoglyphics";
        assertTrue(isograms.isIsograms(input));
    }

    /**
     * false if have repeating letters, consecutive or non-consecutive.
     */
    @Test
    public void testReturnFalseIfHaveRepeatingLetters() {
        String input = "aba";
        assertFalse(isograms.isIsograms(input));
    }

    /**
     * ignore letter case.
     */
    @Test
    public void testReturnFalseIgnoreLetterCase() {
        String input = "moOse";
        assertFalse(isograms.isIsograms(input));
    }
}
