package org.fundacionjala.coding.julia;

import java.util.Arrays;

public final class Isograms {
    /**
     * verifies if the input is or not isogram word.
     * @param input string word
     * @return boolean
     */
    public boolean isIsograms(final String input) {
        if (input.length() == 0) {
            return true;
        } else {
            String lowerCase = input.toLowerCase();
            return isogram(lowerCase);
        }
    }

    private boolean isogram(final String input) {
        char[] arr = input.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < input.length() - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
