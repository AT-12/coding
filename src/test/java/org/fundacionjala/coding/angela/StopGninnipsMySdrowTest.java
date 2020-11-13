package org.fundacionjala.coding.angela;
import org.testng.Assert;
import org.testng.annotations.Test;
public class StopGninnipsMySdrowTest {

    /**
     * Test to basic input.
     */
    @Test
    public void basicInputTest() {
        String input =  "Hey fellow warriors";
        String expectedResult = "Hey wollef sroirraw";
        String actualResult = StopGninnipsMySdrow.invert(input);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Test to string without words bigest than 5 caracters.
     */
    @Test
    public void stringWithoutWordsBigestThan5Caracters() {
        String input =  "This is a test";
        String expectedResult = "This is a test";
        String actualResult = StopGninnipsMySdrow.invert(input);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
