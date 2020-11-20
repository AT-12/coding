package org.fundacionjala.coding.rodrigo;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

/**
 * Isogram class.
 */
public final class Isogram {

    /**
     * Private constructor for utility class.
     */
    private Isogram() {
    }
    /**
     * check if the word is isogram.
     * @param input string message input.
     * @return if the word is isogram.
     */
    public static boolean isIsogram(final String input) {
        List<String> message = Arrays.asList(input.toLowerCase().split(""));
        Set<String> collection = new HashSet<String>(message);
        for (String key : collection) {
            if (Collections.frequency(message, key) > 1) {
                return false;
            }
        }
        return true;
    }
}
