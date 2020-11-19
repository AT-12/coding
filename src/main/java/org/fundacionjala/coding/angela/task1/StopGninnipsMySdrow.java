package org.fundacionjala.coding.angela.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class StopGninnipsMySdrow {
    /**
     * Static variable MIN_CARACTERS.
     */
    public static final int MIN_CARACTERS = 5;

    private StopGninnipsMySdrow() {
    }

    /**
     * Inverts words bigest that 5 caracters.
     * @param input
     * @return String with words inverted
     */
    public static String invert(final String input) {
        List<String> lettersResult = new ArrayList<>();
        List<String> letters = Arrays.asList(input.split(" "));
        letters.stream().forEach(string -> {
            if (string.length() >= MIN_CARACTERS) {
                lettersResult.add(getInvertedWord(string));
            } else {
                lettersResult.add(string);
            }
        });
        return String.join(" ", lettersResult);
    }

    /**
     * Inverts a word.
     * @param word
     * @return word inverted
     */
    private static String getInvertedWord(final String word) {
        StringBuilder builder = new StringBuilder(word);
        return builder.reverse().toString();
    }
}
