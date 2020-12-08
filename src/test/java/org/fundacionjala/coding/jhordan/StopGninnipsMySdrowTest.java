package org.fundacionjala.coding.jhordan;

import org.testng.Assert;
import org.testng.annotations.Test;
public class StopGninnipsMySdrowTest {

    /**
     * Test to basic input.
     */
    @Test
    public void inputAsTheAnnouncement() {
        String input =  "Hey fellow warriors";
        String expectedResult = "Hey wollef sroirraw";
        String actualResult = StopGninnipsMySdrow.invertTheWord(input);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Test a string with words less than 5 caracters.
     */
    @Test
    public void wordsLessThan5Letters() {
        String input =  "This is a test";
        String expectedResult = "This is a test";
        String actualResult = StopGninnipsMySdrow.invertTheWord(input);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *Test a Empty String.
     */
    @Test
    public void wordsEmpty() {
        String input =  " ";
        String expectedResult = "";
        String actualResult = StopGninnipsMySdrow.invertTheWord(input);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Test a String with only numbers.
     */
    @Test
    public void wordsThatHaveOnlyNumbers() {
        String input =  "12345";
        String expectedResult = "54321";
        String actualResult = StopGninnipsMySdrow.invertTheWord(input);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *Test a String with only special Characters.
     */
    @Test
    public void wordsOnlyWithSpecialCharacters() {
        String input =  "@$#!/";
        String expectedResult = "/!#$@";
        String actualResult = StopGninnipsMySdrow.invertTheWord(input);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
