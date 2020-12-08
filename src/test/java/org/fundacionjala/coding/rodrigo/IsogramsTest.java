package org.fundacionjala.coding.rodrigo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsogramsTest {

    /**
     * Basic input test.
     */
    @Test
    public void noRepeatedWordsTest() {
        String input = "Dermatoglyphics";

        boolean actualResult = Isogram.isIsogram(input);

        Assert.assertTrue(actualResult);
    }

    /**
     * Basic input test.
     */
    @Test
    public void repeatedWordsTest() {
        String input = "aba";

        boolean actualResult = Isogram.isIsogram(input);

        Assert.assertFalse(actualResult);
    }

    /**
     * Basic input test.
     */
    @Test
    public void ignoreLetterCaseTest() {
        String input = "moOse";

        boolean actualResult = Isogram.isIsogram(input);

        Assert.assertFalse(actualResult);
    }
}
