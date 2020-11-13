package org.fundacionjala.coding.mirko;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains basic tests for Stop gninnipS My sdroW! exercise.
 */
public class StopGninnipsMySdrowTest {
    /**
     * First i/o example present at https://www.codewars.com/kata/5264d2b162488dc400000001/java.
     */
    @Test
    public void basicFirstInputTest() {
        String input = "Hey fellow warriors";
        String expected = "Hey wollef sroirraw";
        String actual = StopGninnipsMySdrow.spinWords(input);
        Assert.assertEquals(actual, expected);
    }

    /**
     * Second i/o example present at https://www.codewars.com/kata/5264d2b162488dc400000001/java.
     */
    @Test
    public void basicSecondInputTest() {
        String input = "This is a test";
        String expected = "This is a test";
        String actual = StopGninnipsMySdrow.spinWords(input);
        Assert.assertEquals(actual, expected);
    }

    /**
     * Third i/o example present at https://www.codewars.com/kata/5264d2b162488dc400000001/java.
     */
    @Test
    public void basicThirdInputTest() {
        String input = "This is another test";
        String expected = "This is rehtona test";
        String actual = StopGninnipsMySdrow.spinWords(input);
        Assert.assertEquals(actual, expected);
    }

    /**
     * Test that verify if the method works correctly for an empty String.
     */
    @Test
    public void emptyInputTest() {
        String input = "";
        String expected = "";
        String actual = StopGninnipsMySdrow.spinWords(input);
        Assert.assertEquals(actual, expected);
    }
}
