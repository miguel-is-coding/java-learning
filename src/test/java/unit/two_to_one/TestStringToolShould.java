package unit.two_to_one;

import org.detect_the_pangram.PangramChecker;
import org.junit.Assert;
import org.junit.Test;
import org.two_to_one.StringTool;

public class TestStringToolShould {
//    sentence1 = "a", sentence2= "a" -> return "a"
//    sentence1 = "a", sentence2 = "b" -> return "ab"
//    sentence1 = "b", sentence2 = "a" -> return "ab"
//    sentence1 = "abcdefghijklmnopqrstuvwxyz", sentence2 = "abcdefghijklmnopqrstuvwxyz" -> return "abcdefghijklmnopqrstuvwxyz"

    @Test
    public void concat_two_different_sentences_that_have_distinct_letters() throws Exception {
        String firstSentence = "a";
        String lastSentence = "b";

        StringTool tool = new StringTool();

        Assert.assertEquals("ab", tool.longestDistinct(firstSentence, lastSentence));
    }

    @Test
    public void sort_two_different_sentences_that_have_distinct_letters() throws Exception {
        String firstSentence = "b";
        String lastSentence = "a";

        StringTool tool = new StringTool();

        Assert.assertEquals("ab", tool.longestDistinct(firstSentence, lastSentence));
    }

    @Test
    public void concat_and_sort_two_different_sentences_only_with_the_distinct_letters() throws Exception {
        String firstSentence = "xyaabbbccccdefww";
        String lastSentence = "xxxxyyyyabklmopq";

        StringTool tool = new StringTool();

        Assert.assertEquals("abcdefklmopqwxy", tool.longestDistinct(firstSentence, lastSentence));
    }
}
