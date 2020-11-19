package org.fundacionjala.coding.elizabeth;

/**
 * Check if a word is an Isogram.
 */
public class Isograms {

    /**
     * Check if a word is an isogram, if a word has no repeating letters.
     * @param word
     * @return true if the word is an isogram.
     */
    public boolean isIsogram(final String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().indexOf(word.toLowerCase().charAt(i), i + 1) != -1) {
                return false;
            }
        }
        return true;
    }
}
