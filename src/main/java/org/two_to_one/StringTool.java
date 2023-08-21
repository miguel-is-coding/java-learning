package org.two_to_one;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringTool {
    public String longestDistinct(String firstSentence, String lastSentence) {
        return Stream.of(firstSentence.concat(lastSentence).split(""))
                .sorted()
                .distinct()
                .collect(Collectors.joining());
    }
}
