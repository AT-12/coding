package org.fundacionjala.coding.jhordan;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsIsogramTest {

    /**
     * Test to basic input.
     */
    @Test
    public void inputAsTheAnnouncement() {
        String input =  "Dermatoglyphics";
        boolean expectedResult = true;
        boolean actualResult = Isogram.isIsogram(input);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Test to basic input.
     */
    @Test
    public void inputWithTwoLetterEquals() {
        String input =  "aba";
        boolean expectedResult = false;
        boolean actualResult = Isogram.isIsogram(input);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Test to basic input.
     */
    @Test
    public void inputWithTwoLetterOneCapitalLetter() {
        String input =  "moOse";
        boolean expectedResult = false;
        boolean actualResult = Isogram.isIsogram(input);
        Assert.assertEquals(actualResult, expectedResult);
    }

}
