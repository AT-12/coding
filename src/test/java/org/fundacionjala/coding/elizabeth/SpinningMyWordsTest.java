package org.fundacionjala.coding.elizabeth;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Defines spinning words tests.
 */
public class SpinningMyWordsTest
{
    private SpinningMyWords SpinningWords;

    /**
     * Basic input test.
     */
    @Test
    public void basicInputTest() {
        SpinningMyWords sp = new SpinningMyWords();
        String input = "Hey fellow warriors";

        String expectedResult = "Hey wollef sroirraw";
        String actualResult = sp.spinningWords(input);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Basic input test.
     */
    @Test
    public void spinningWordTest() {
        SpinningMyWords sp = new SpinningMyWords();
        String input = "warriors";

        String expectedResult = "sroirraw";
        String actualResult = sp.spinningWord(input);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
