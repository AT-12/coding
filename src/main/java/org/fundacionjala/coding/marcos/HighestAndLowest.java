package org.fundacionjala.coding.marcos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A.
 */
public final class HighestAndLowest {

    /**
     * A.
     */
    private HighestAndLowest() {

    }

    /**
     * A.
     * @param input input.
     * @return result
     */
    public static String calculate(final String input) {
        List<String> numbersAsChars = Arrays.asList(input.split(" "));
        List<Integer> numbers = numbersAsChars.stream().map(Integer::valueOf).collect(Collectors.toList());
        return String.format("%d %d", Collections.max(numbers), Collections.min(numbers));
    }
}
