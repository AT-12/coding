package org.fundacionjala.coding.elizabeth;

import java.util.Arrays;
import java.util.List;

/**
 * Spinning Words utility class.
 */
public class SpinningMyWords {
    /**
     * variable letter.
     */
    private static final int LETTERS = 5;

    /**
     * Private constructor for utility class.
     */
    public SpinningMyWords() {

    }

    /**
     * spinning words.
     *
     * @param spinWords string.
     * @return string, but with all five or more letter words reversed .
     */

    public String spinningMyWords(final String spinWords) {
        List<String> wordsList = Arrays.asList(spinWords.split(" "));
        for (int i = 0; i < wordsList.size(); i++) {
            if (wordsList.get(i).length() >= LETTERS) {
                wordsList.set(i, spinningWord(wordsList.get(i)));
            }
        }
        System.out.println();
        return String.join(" ", wordsList);
    }

    /**
     * spinning word.
     *
     * @param word string.
     * @return string, but with word reversed .
     */
    public String spinningWord(final String word) {
        String reversed = "";
        for (int index = word.length() - 1; index >= 0; index--) {
            reversed += word.charAt(index);
        }
        return reversed;
    }
}
