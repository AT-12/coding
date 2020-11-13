package org.fundacionjala.coding.rodrigo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SpinningWordsTest {

    /**
     * Basic input test.
     */
    @Test
    public void justWordsWithMoreThanFiveLettersTest() {
        String input = "Welcome fellow warriors";

        String expectedResult = "emocleW wollef sroirraw";
        String actualResult = SpinningWords.spinningMessage(input);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Basic input test.
     */
    @Test
    public void justWordsWithLessThanFiveLettersTest() {
        String input = "Hey guys how are you";

        String expectedResult = "Hey guys how are you";
        String actualResult = SpinningWords.spinningMessage(input);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Basic input test.
     */
    @Test
    public void oneWordWithLessThanThreeLettersAndTwoWithMoreThanFiveTest() {
        String input = "Hey fellow warriors";

        String expectedResult = "Hey wollef sroirraw";
        String actualResult = SpinningWords.spinningMessage(input);

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Basic input test.
     */
    @Test
    public void oneWordWithMoreThanFiveLettersAndTwoWithLessThanFiveTest() {
        String input = "This is rodrigo";

        String expectedResult = "This is ogirdor";
        String actualResult = SpinningWords.spinningMessage(input);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
