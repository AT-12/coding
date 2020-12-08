package org.fundacionjala.coding.laura;

public final class Isograms {

    /**
     * Constructor without arguments.
     */
    private Isograms() {
    }

    /**
     * Checks if the String given is an Isogram Word.
     * @param word - String to check
     * @return result - True if the word is Isogram or contains only spaces, False otherwise.
     * @throws NullPointerException
     */
    public static boolean isIsogram(final String word) throws NullPointerException {
        boolean result = false;
        if (word.isBlank() || word.length() >= 0) {
            String wordWithoutSpaces = new String(word.trim().toLowerCase());
            for (int i = 0; i < wordWithoutSpaces.length(); i++) {
                char letter = wordWithoutSpaces.charAt(i);
                for (int k = i + 1; k < wordWithoutSpaces.length(); k++) {
                    if (letter == wordWithoutSpaces.charAt(k)) {
                        return false;
                    }
                }
            }
            result = true;
        }
        return result;
    }
}
