package org.fundacionjala.coding.marcos;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * A.
 */
public class HighestAndLowestTest {

    /**
     * A.
     */
    @Test
    public void basicInputTest() {
        String input = "1 2 3 4 5";

        String expectedResult = "5 1";
        String actualResult = HighestAndLowest.calculate(input);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
