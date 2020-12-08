package org.fundacionjala.coding.angela.task2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsogramTest {
    /**
     * Test a string without duplicated characters.
     */
    @Test
    public void stringWithoutDuplicatedCharacters() {
        String string = "Dermatoglyphics";
        boolean expectedResult = true;
        boolean actualResult = Isogram.isIsogram(string);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Test a string with duplicated characters.
     */
    @Test
    public void stringWithDuplicatedCharacters() {
        String string = "aba";
        boolean expectedResult = false;
        boolean actualResult = Isogram.isIsogram(string);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Test with upercase string.
     */
    @Test
    public void upercaseString() {
        String string = "moOse";
        boolean expectedResult = false;
        boolean actualResult = Isogram.isIsogram(string);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
