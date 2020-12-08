package org.fundacionjala.coding.mirko;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This class contains basic tests for 'Isograms' exercise.
 */
public class IsogramsTest {

    /**
     * First i/o example present at https://www.codewars.com/kata/54ba84be607a92aa900000f1.
     */
    @Test
    public void basicFirstInputTest() {
        String input = "Dermatoglyphics";
        Boolean actual = Isograms.isIsogram(input);
        Assert.assertTrue(actual);
    }

    /**
     * Second i/o example present at https://www.codewars.com/kata/54ba84be607a92aa900000f1.
     */
    @Test
    public void basicSecondInputTest() {
        String input = "aba";
        Boolean actual = Isograms.isIsogram(input);
        Assert.assertFalse(actual);
    }

    /**
     * Third i/o example present at https://www.codewars.com/kata/54ba84be607a92aa900000f1.
     */
    @Test
    public void basicThirdInputTest() {
        String input = "moOse";
        Boolean actual = Isograms.isIsogram(input);
        Assert.assertFalse(actual);
    }

    /**
     * Test that verify if the method works correctly for an empty String.
     */
    @Test
    public void emptyInputTest() {
        String input = "";
        Boolean actual = Isograms.isIsogram(input);
        Assert.assertTrue(actual);
    }
}
