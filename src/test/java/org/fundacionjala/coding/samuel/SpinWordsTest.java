package org.fundacionjala.coding.samuel;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * SpinWords tests.
 */
public class SpinWordsTest {

    /**
     * First basic input test.
     */
    @Test
    public void exampleInputOneTest() {
        String input = "Hey fellow warriors";
        String expectedResult = "Hey wollef sroirraw";
        String actualResult = SpinWords.solution(input);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Second basic input test.
     */
    @Test
    public void exampleInputTwoTest() {
        String input = "This is a test";
        String expectedResult = "This is a test";
        String actualResult = SpinWords.solution(input);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Third basic input test.
     */
    @Test
    public void exampleInputThreeTest() {
        String input = "This is another test";
        String expectedResult = "This is rehtona test";
        String actualResult = SpinWords.solution(input);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
