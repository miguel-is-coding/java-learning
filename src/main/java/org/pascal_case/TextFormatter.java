package org.pascal_case;

public class TextFormatter {
    public String pascalCase(String text) {
        if (text.isEmpty()) {
            return "";
        }
        String delimiters = "[-_\\s]";
        String[] splitText = text.split(delimiters);
        String[] capitalizedWords = capitalizeWords(splitText);
        return String.join("", capitalizedWords);
    }

    private static String[] capitalizeWords(String[] splitText) {
        String[] capitalizedWords = new String[splitText.length];
        for (int i = 0; i < splitText.length; i++) {
            String word = splitText[i];
            String firstCharacter = word.substring(0, 1);
            String capitalizedWord = word.replace(firstCharacter, firstCharacter.toUpperCase());
            capitalizedWords[i] = capitalizedWord;
        }
        return capitalizedWords;
    }
}
