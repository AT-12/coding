package org.fundacionjala.coding.jhordan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class StopGninnipsMySdrow {
    /**
     * Static Constant that contains the minimum characters.
     */
    public static final int MIN_CHARACTERS = 5;

    private StopGninnipsMySdrow() {
    }

    /**
     * Inverts words bigest that 5 caracters.
     * @param input
     * @return String with words inverted
     */
    public static String invertTheWord(final String input) {
        List<String> lettersResult = new ArrayList<>();
        List<String> letters = Arrays.asList(input.split(" "));
        for (String word: letters) {
            if (word.length() >= MIN_CHARACTERS) {
                lettersResult.add(getInvertedWord(word));
            } else {
                lettersResult.add(word);
            }
        }
        return String.join(" ", lettersResult);
    }

    /**
     * Inverts a word.
     * @param word
     * @return word inverted
     */
    private static String getInvertedWord(final String word) {
        StringBuilder wordReversed = new StringBuilder(word);
        return wordReversed.reverse().toString();
    }
}
