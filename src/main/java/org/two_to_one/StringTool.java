package org.two_to_one;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringTool {
    public String longestDistinct(String firstSentence, String lastSentence) {
        String concatenated = firstSentence + lastSentence;
        char[] characters = concatenated.toCharArray();
        Arrays.sort(characters);

        StringBuilder result = new StringBuilder();
        for (Character letter : characters) {
            if (result.indexOf(String.valueOf(letter)) == -1) {
                result.append(letter);
            }
        }

        return result.toString();
    }
}
