package org.fundacionjala.coding.julia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class StopGninnipSMySdroW {

    /**
     * minimum size of a word.
     */
    public static final int STRING_SIZE_MIN = 5;
    private StopGninnipSMySdroW() {
    }

    /**
     * get the result of the spin words process.
     * @param input a string to process
     * @return a string as result of process
     */
    public static String spinWords(final String input) {
        List<String> results = new ArrayList<>();
        List<String> inputs = Arrays.asList(input.split(" "));
        inputs.stream().forEach((word) -> {
            if (word.length() >= STRING_SIZE_MIN) {
                results.add(invertWord(word));
            } else {
                results.add(word);
            }
        });
        return String.join(" ", results);
    }

    /**
     * get a word reverted.
     * @param word to reverse
     * @return a word reverted
     */
    private static String invertWord(final String word) {
        StringBuilder builder = new StringBuilder(word);
        return builder.reverse().toString();
    }
}
