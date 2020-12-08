package org.fundacionjala.coding.jhordan;

public final  class Isogram {
    /**
     * Default Constructor.
     */
    private Isogram() {
    }

    /**
     * To verify if the word is isogram.
     * @param inputString the that will be verified.
     * @return if it is isogram.
     */
    public static boolean isIsogram(final String inputString) {
        String input = inputString.toLowerCase();
        char[] letters;
        letters = input.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            char actualLetter = letters[i];
            int count = 0;
            for (int j = 0; j < letters.length; j++) {
                if (letters[j] == actualLetter)  {
                    count++;
                }
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
