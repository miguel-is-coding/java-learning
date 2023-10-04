package org.pascal_case;

public class TextFormatter {
    public String pascalCase(String text) {
        if (text.isEmpty()) {
            return "";
        }
        String[] splittedText = text.split(" ");
        return String.join("", splittedText);
    }
}
