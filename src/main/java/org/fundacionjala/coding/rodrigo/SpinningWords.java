package org.fundacionjala.coding.rodrigo;

import java.util.Arrays;
import java.util.List;

/**
 * Spinning Words class.
 */
public final class SpinningWords {

    /**
     * Condition for reversing words.
     */
    private static final int LIMIT = 5;

    /**
     * Private constructor for utility class.
     */
    private SpinningWords() {

    }

    /**
     * Spin the words with more letters than the limit
     *
     * @param input string message input.
     * @return message with the spin words if there is
     */
    public static String spinningMessage(final String input) {
        List<String> message = Arrays.asList(input.split(" "));
        message.stream().forEach((word) -> {
            if (word.length() >= LIMIT) {
                StringBuilder builder = new StringBuilder(word);
                String reverse = builder.reverse().toString();
                message.set(message.indexOf(word), reverse);
            }
        });
        String str = String.join(" ", message);
        return str;
    }
}
