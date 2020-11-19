package org.fundacionjala.coding.mirko;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public final class Isograms {

    private Isograms() {
    }

    /**
     * This method verifies if a String is an Isogram or not.
     *
     * @param input String that will be analyzed.
     * @return true if the String is an Isogram, otherwise return false.
     */
    public static Boolean isIsogram(final String input) {
        List<String> lettersAsList = Arrays.asList(input.toLowerCase().split(""));
        Set withoutRepeated = new HashSet<>(lettersAsList);
        if (lettersAsList.size() == withoutRepeated.size()) {
            return true;
        }
        return false;
    }
}
