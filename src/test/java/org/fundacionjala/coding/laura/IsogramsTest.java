package org.fundacionjala.coding.laura;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsogramsTest {

    /**
     * Tests if Empty String is considerated as Isogram word.
     */
    @Test
    public void testEmptyStringReturnsTrue() {
        Boolean expected = true;
        Boolean actual = Isograms.isIsogram("");
        Assert.assertEquals(actual, expected);
    }
    /**
     * Tests if Empty String that contains only white spaces is considerated as Isogram word.
     */
    @Test
    public void testEmptyStringContainsWhiteSpacesReturnsTrue() {
        Boolean expected = true;
        Boolean actual = Isograms.isIsogram("    ");
        Assert.assertEquals(actual, expected);
    }
    /**
     * Tests if Null String throws an exception.
     */
    @Test(expectedExceptions = NullPointerException.class)
    public void testSpinNullStringThrowsNullPointerException() {
        Isograms.isIsogram(null);
    }
    /**
     * Tests if String without duplicated letters is considerated as Isogram word.
     */
    @Test
    public void testIsogramWordReturnsTrue() {
        Boolean expected = true;
        Boolean actual = Isograms.isIsogram("Dermatoglyphics");
        Assert.assertEquals(actual, expected);
    }
    /**
     * Tests if String with duplicated letters is not considerated as Isogram word.
     */
    @Test
    public void testNonIsogramWordReturnsFalse() {
        Boolean expected = false;
        Boolean actual = Isograms.isIsogram("BAB");
        Assert.assertEquals(actual, expected);
    }
    /**
     * Tests if String with duplicated letters is not considerated as Isogram word.
     */
    @Test
    public void testNonIsogramWordWithRepeatedLettersAtMiddleReturnsFalse() {
        Boolean expected = false;
        Boolean actual = Isograms.isIsogram("labaks");
        Assert.assertEquals(actual, expected);
    }
    /**
     * Tests if String with duplicated letters in upper and lower case is not considerated as Isogram word.
     */
    @Test
    public void testNonIsogramWordWithUperCaseRepeatedLetterReturnFalse() {
        Boolean expected = false;
        Boolean actual = Isograms.isIsogram("wOord");
        Assert.assertEquals(actual, expected);
    }
}
