package org.fundacionjala.coding.samuel;

import java.util.Arrays;

public final class Isogram {

    /**
     * Private constructor for utility class.
     */
    private Isogram() {
    }

    /**
     *
     * @param input of the problem
     * @return if isIsogram
     */
    public static boolean  isIsogram(final String input) {
        String phraseLower = input.toLowerCase();
        char[] phraseSort = phraseLower.toCharArray();
        Arrays.sort(phraseSort);

        for (int i = 0; i < phraseSort.length - 1; i++) {
            if (phraseSort[i] == phraseSort[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
