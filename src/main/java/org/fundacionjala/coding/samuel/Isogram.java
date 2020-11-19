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

        for (int position = 0; position < phraseSort.length - 1; position++) {
            if (phraseSort[position] == phraseSort[position + 1]) {
                return false;
            }
        }
        return true;
    }
}
