package org.detect_the_pangram;

import java.util.ArrayList;

public class PangramChecker {
    private static final int ALPHABET_LENGTH = 26;

    public boolean isPangram(String sentence) {
        ArrayList<String> matches = new ArrayList<>();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            String parsedLetter = String.valueOf(letter);
            if (sentence.toLowerCase().contains(parsedLetter)) {
                matches.add(parsedLetter);
            }
        }
        return matches.toArray().length == ALPHABET_LENGTH;
    }
}
