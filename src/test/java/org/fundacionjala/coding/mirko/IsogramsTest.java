package org.fundacionjala.coding.mirko;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsogramsTest {
    @Test
    public void basicFirstInputTest() {
        String input = "Dermatoglyphics";
        Boolean actual = Isograms.verify(input);
        Assert.assertTrue(actual);
    }

    @Test
    public void basicSecondInputTest() {
        String input = "aba";
        Boolean actual = Isograms.verify(input);
        Assert.assertFalse(actual);
    }

    @Test
    public void basicThirdInputTest() {
        String input = "moOse";
        Boolean actual = Isograms.verify(input);
        Assert.assertFalse(actual);
    }

    @Test
    public void EmptyInputTest() {
        String input = "";
        Boolean actual = Isograms.verify(input);
        Assert.assertTrue(actual);
    }
}
