package org.fundacionjala.coding.laura;

/**
 * Class Spin words.
 */
public final class SpinWords {

    /**The index left that will be used to reverse an array. */
    private static final int INDEX_LEFT = 0;
    /**The size of word to be spinned. */
    private static final int SIZE_WORD = 5;

    /**
     * Constructor without arguments.
     */
    private SpinWords() {
    }
    /**
     * Spin words with >=5 letters of a given String.
     * @param input - String to be spinned
     * @return spinnedResult - String
     * @throws NullPointerException
     */
    public static String spinWords(final String input) throws NullPointerException {
        String spinnedResult = new String();
        if (!input.isEmpty()) {
            String[] parts = input.split(" ");
            int i = 0;
            for (String part: parts) {
                if (part.length() >= SIZE_WORD) {
                    char[] reversed = reverseArray(part.toCharArray());
                    parts[i] = String.copyValueOf(reversed);
                }
                i++;
            }
            spinnedResult = String.join(" ", parts);
        }
        return spinnedResult;
    }

    /**
     * Reverse array of chars.
     * @param chars - Char Array to reverse
     * @return chars - Char Array reverted
     * @throws NullPointerException
     */
    public static char[] reverseArray(final char[] chars) throws NullPointerException {
        int left = INDEX_LEFT;
        int right = chars.length - 1;
        if (chars.length > 1) {
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return chars;
    }
}
