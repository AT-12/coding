package org.fundacionjala.coding.mirko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class that spins words.
 */
public final class StopGninnipsMySdrow {

    /**
     * Size of the words that will be reversed.
     */
    static final int MAX_WORD_SIZE = 4;

    /**
     * Private constructor for utility class.
     */
    private StopGninnipsMySdrow() {
    }

    /**
     * It receive a String with words separated by blanks, the words with more than four letters will be reversed.
     *
     * @param input String to be processed according the terms of the exercise.
     * @return the result String with more than four letters words reversed.
     */
    public static String spinWords(final String input) {
        List<String> wordsList = Arrays.asList(input.split(" "));
        List<String> result = new ArrayList<>();
        wordsList.stream().forEach((word) -> {
            if (word.length() > MAX_WORD_SIZE) {
                word = new StringBuffer(word).reverse().toString();
            }
            result.add(word);
        });
        return result.stream().collect(Collectors.joining(" "));
    }
}
