package org.pascal_case;

public class TextFormatter {
    public String pascalCase(String text) {
        if (text.isEmpty()) {
            return "";
        }
        String delimiters = "[-_\\s]";
        String[] splitText = text.split(delimiters);
        return String.join("", splitText);
    }
}
