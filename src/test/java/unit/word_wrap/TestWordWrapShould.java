package unit.word_wrap;

import org.word_wrap.WordWrap;
import org.junit.Assert;
import org.junit.Test;

public class TestWordWrapShould {

    @Test
    public void not_wrap_text_when_is_empty() throws Exception {
        String text = "";
        int columnWidth = 6;

        WordWrap textWrapper = new WordWrap(text, columnWidth);

        Assert.assertEquals("", textWrapper.wrap());
    }

    @Test
    public void not_wrap_text_when_fits_column_width() throws Exception {
        String text = "hello";
        int columnWidth = 5;

        WordWrap textWrapper = new WordWrap(text, columnWidth);

        Assert.assertEquals("hello", textWrapper.wrap());
    }

    @Test
    public void wrap_text_once_when_is_larger_than_column_width() throws Exception {
        String text = "helloworld";
        int columnWidth = 5;

        WordWrap textWrapper = new WordWrap(text, columnWidth);

        Assert.assertEquals("hello\nworld", textWrapper.wrap());
    }

    @Test
    public void wrap_text_several_times_when_is_larger_than_column_width() throws Exception {
        String text = "helloworld!";
        int columnWidth = 5;

        WordWrap textWrapper = new WordWrap(text, columnWidth);

        Assert.assertEquals("hello\nworld\n!", textWrapper.wrap());
    }

    @Test
    public void add_new_line_instead_of_space() throws Exception {
        String text = "hello world!";
        int columnWidth = 6;

        WordWrap textWrapper = new WordWrap(text, columnWidth);

        Assert.assertEquals("hello\nworld!", textWrapper.wrap());
    }
}
