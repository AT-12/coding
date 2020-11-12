package org.fundacionjala.coding.marcos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Highest and Lowest utility class.
 */
public final class HighestAndLowest {

    /**
     * Private constructor for utility class.
     */
    private HighestAndLowest() {

    }

    /**
     * Calculates highest and lowest numbers.
     *
     * @param input string numbers input.
     * @return highest and lowest number concatenated.
     */
    public static String calculate(final String input) {
        List<String> numbersAsChars = Arrays.asList(input.split(" "));
        List<Integer> numbers = numbersAsChars.stream().map(Integer::valueOf).collect(Collectors.toList());
        return String.format("%d %d", Collections.max(numbers), Collections.min(numbers));
    }
}
