package org.detect_the_pangram;

import java.util.ArrayList;

public class PangramChecker {
    public String[] alphabet = {"a", "b", "c", "d", "f", "g", "h", "y", "j","k","l","m","n","o","p","q","r","s","t","v","w","x","y","z"};

    public boolean isPangram(String sentence) {
        ArrayList<String> matches = new ArrayList<>(this.alphabet.length);
        for (String letter: this.alphabet) {
            if (sentence.toLowerCase().contains(letter)) {
                matches.add(letter);
            }
        }
        return matches.toArray().length == this.alphabet.length;
    }
}
