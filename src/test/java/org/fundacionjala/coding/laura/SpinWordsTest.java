package org.fundacionjala.coding.laura;


import org.testng.Assert;
import org.testng.annotations.Test;

public class SpinWordsTest {
    /**
     * Tests if Empty String returns Empty String when spinning words.
     */
    @Test
    public void testEmptyStringReturnsEmptyString() {
        String actual = SpinWords.spinWords("");
        Assert.assertEquals(actual, "");
    }
    /**
     * Tests if Null String throws an exception.
     */
    @Test(expectedExceptions = NullPointerException.class)
    public void testSpinNullStringThrowsNullPointerException() {
        SpinWords.spinWords(null);
    }
    /**
     * Tests if the function spin two words with equal or greater than
     * five letters from a given String.
     */
    @Test
    public void testSpinTwoWordsAtEndOfString() {
        String input = "Hey fellow warriors";
        String expected = "Hey wollef sroirraw";
        String actual = SpinWords.spinWords(input);
        Assert.assertEquals(actual, expected);
    }
    /**
     * Tests reverse function of an array of characters with more elements than one.
     */
    @Test
    public void testReverseOneArrayOfChars() {
        char[] input = {'w', 'o', 'l', 'l', 'e', 'f'};
        char[] expected = {'f', 'e', 'l', 'l', 'o', 'w'};
        char[] actual = SpinWords.reverseArray(input);
        Assert.assertEquals(actual, expected);
    }
    /**
     * Tests if Null String throws an exception.
     */
    @Test(expectedExceptions = NullPointerException.class)
    public void testReverseNullArrayOfCharsGivesThrowsNullPointerException() {
        SpinWords.reverseArray(null);
    }
    /**
     * Tests reverse function of an array of characters with one element.
     */
    @Test
    public void testReverseArrayOfLengthOneGivesTheSameArray() {
        char[] input = {'w'};
        char[] expected = {'w'};
        char[] actual = SpinWords.reverseArray(input);
        Assert.assertEquals(actual, expected);
    }
}
