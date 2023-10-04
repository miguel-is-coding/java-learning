package unit.pascal_case;

import org.junit.Assert;
import org.junit.Test;
import org.pascal_case.TextFormatter;

public class TestPascalCaseShould {
    /*
     * Having a text whose words can be delimited by spaces,
     * hyphens and/or underscores, return the text in pascal case format
     * (The first letter of each word is capitalized).
     *
     * Example
     * text = ''  // => ''
     * text = 'Foo'  // => 'Foo'
     * text = 'Foo Bar'  // => 'FooBar'
     * text = 'Foo_Bar-Foo' // => 'FooBarFoo'
     * text = 'foo'  // => 'Foo'
     * text = 'foo_bar foo-bar' // => 'FooBarFooBar'
     */
    @Test
    public void do_not_change_text_when_text_is_empty() {
        String text = "";

        TextFormatter textFormatter = new TextFormatter();

        Assert.assertEquals("", textFormatter.pascalCase(text));
    }

    @Test
    public void do_not_change_text_when_text_is_one_word_capitalized() {
        String text = "Foo";

        TextFormatter textFormatter = new TextFormatter();

        Assert.assertEquals("Foo", textFormatter.pascalCase(text));
    }

    @Test
    public void join_text_when_it_contains_capitalized_words_separated_by_an_space() {
        String text = "Foo Bar";

        TextFormatter textFormatter = new TextFormatter();

        Assert.assertEquals("FooBar", textFormatter.pascalCase(text));
    }

    @Test
    public void join_text_when_it_contains_capitalized_words_separated_by_either_underscore_or_hyphen() {
        String text = "foo_bar foo-bar";

        TextFormatter textFormatter = new TextFormatter();

        Assert.assertEquals("FooBarFooBar", textFormatter.pascalCase(text));
    }

    @Test
    public void capitalize_text_when_it_contains_lowercase_words() {
        String text = "Foo_Bar-Foo";

        TextFormatter textFormatter = new TextFormatter();

        Assert.assertEquals("FooBarFoo", textFormatter.pascalCase(text));
    }
}
