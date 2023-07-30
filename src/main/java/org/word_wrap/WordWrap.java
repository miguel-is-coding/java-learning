package org.word_wrap;

public class WordWrap {
    private final String text;
    private final int columnWidth;

    public WordWrap(String text, int columnWidth) {
        this.text = text;
        this.columnWidth = columnWidth;
    }

    public String wrap() {
        if (this.text.length() <= this.columnWidth) {
            return this.text;
        }

        String wrappedText = "";
        String remainingUnwrappedText = this.text;

        while(remainingUnwrappedText.length() > this.columnWidth){
            String textFillingColumnWidth = remainingUnwrappedText.substring(0, this.columnWidth);
            int whiteSpaceIndex = textFillingColumnWidth.indexOf(" ");
            if (whiteSpaceIndex != -1) {
                wrappedText = wrappedText + remainingUnwrappedText.substring(0, whiteSpaceIndex + 1).trim() + "\n";
                remainingUnwrappedText = remainingUnwrappedText.substring(whiteSpaceIndex + 1);
            } else {
                wrappedText = wrappedText + remainingUnwrappedText.substring(0, this.columnWidth) + "\n";
                remainingUnwrappedText = remainingUnwrappedText.substring(this.columnWidth);
            }
        }

        int whiteSpaceIndex = remainingUnwrappedText.indexOf(" ");
        if (whiteSpaceIndex != -1) {
            return wrappedText + remainingUnwrappedText.substring(0, whiteSpaceIndex + 1).trim() + "\n" +
                    remainingUnwrappedText.substring(whiteSpaceIndex + 1);
        }
        return wrappedText + remainingUnwrappedText;
    }
}
