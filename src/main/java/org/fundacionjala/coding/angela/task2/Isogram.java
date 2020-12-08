package org.fundacionjala.coding.angela.task2;
import java.util.Arrays;

public final class Isogram {

    /**
     * Constructor of class.
     */
    private Isogram() {
    }

    /**
     * Evaluates if the string is isogram.
     * @param string to evaluate
     * @return true if the string is isogram
     */
    public static boolean isIsogram(final String string) {
        String stringLowercase = string.toLowerCase();
        int len = stringLowercase.length();
        char[] array = stringLowercase.toCharArray();
        Arrays.sort(array);
        for (int i = 0; i < len - 1; i++) {
            if (array[i] == array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
