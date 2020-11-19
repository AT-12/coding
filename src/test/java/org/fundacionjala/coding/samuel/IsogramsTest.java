package org.fundacionjala.coding.samuel;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * Defines Isograms tests.
 */
public class IsogramsTest {

    /**
     * Test return true because "Dermatoglyphics" is a Isogram.
     */
    @Test
    public void testUpperLowerCaseTrue() {
        Assert.assertEquals(Isogram.isIsogram("Dermatoglyphics"), true);
    }

    /**
     * Test return true because "isogram" is a Isogram.
     */
    @Test
    public void testLowerCaseTrue() {
        Assert.assertEquals(Isogram.isIsogram("isogram"), true);
    }

    /**
     * Test return true because "" is a Isogram.
     */
    @Test
    public void testEmptyTrue() {
        Assert.assertEquals(Isogram.isIsogram(""), true);
    }

    /**
     * Test return false because "moose" is not a Isogram.
     */
    @Test
    public void testLowerCaseFalse() {
        Assert.assertEquals(Isogram.isIsogram("moose"), false);
    }

    /**
     * Test return false because "isIsogram" is not a Isogram.
     */
    @Test
    public void testUpperLowerCaseFalse() {
        Assert.assertEquals(Isogram.isIsogram("isIsogram"), false);
    }

    /**
     * Test return false because "aba" is not a Isogram.
     */
    @Test
    public void testLowerCaseVariationFalse() {
        Assert.assertEquals(Isogram.isIsogram("aba"), false);
    }

    /**
     * Test return false because "moOse" is not a Isogram.
     */
    @Test
    public void testLowerUpperCaseVariationFalse() {
        Assert.assertEquals(Isogram.isIsogram("moOse"), false);
    }
}
