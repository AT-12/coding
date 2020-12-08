package org.fundacionjala.coding.julia;

import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

public class StopGninnipSMySdroWTest {
    /**
     * test invert if a word is greater than five.
     */
    @Test
    public void testInvertsIfAWordIsGreaterThanFive() {
        String input = "Hey fellow warriors";
        String expected =  "Hey wollef sroirraw";
        String result =  StopGninnipSMySdroW.spinWords(input);
        assertEquals(expected, result);
    }

    /**
     * test does not inverts if word is less than five.
     */
    @Test
    public void testDoesNotInvertsIfAWordIsLessThanFive() {
        String input = "This is a test";
        String expected =  "This is a test";
        String result =  StopGninnipSMySdroW.spinWords(input);
        assertEquals(expected, result);
    }
}
