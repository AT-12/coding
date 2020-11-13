    package org.fundacionjala.coding.samuel;

import java.util.Arrays;
import java.util.List;
/**
 * SpinWords utility class.
 */
public final class SpinWords {
    /**
     * Restriction of the problem.
     */
    static final int RESTRICTION_WORD_SIZE = 5;

    /**
     * Private constructor for utility class.
     */
    private SpinWords() {

    }

    /**
     *  Calculates highest and lowest numbers.
     * @param sentence string numbers input.
     * @return highest and lowest number concatenated.
     */
    public static String solution(final String sentence) {
        List<String> stringList = Arrays.asList(sentence.split(" "));
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            if (element.length() > RESTRICTION_WORD_SIZE) {
                stringList.set(i, new StringBuilder(element).reverse().toString());
            }
        }
        return String.join(" ", stringList);
    }
}
