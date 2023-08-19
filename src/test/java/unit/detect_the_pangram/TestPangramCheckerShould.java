package unit.detect_the_pangram;

import org.detect_the_pangram.PangramChecker;
import org.junit.Assert;
import org.junit.Test;

public class TestPangramCheckerShould {
//    ! sentence.includes(alphabet) -> return false
//    sentence.includes(alphabet) -> return true

    @Test
    public void detect_a_text_that_is_not_a_pangram() throws Exception {
        String sentence = "This is not a pangram";

        PangramChecker checker = new PangramChecker();

        Assert.assertFalse(checker.isPangram(sentence));
    }

    @Test
    public void detect_a_text_that_is_a_pangram() throws Exception {
        String sentence = "The quick brown fox jumps over the lazy dog";

        PangramChecker checker = new PangramChecker();

        Assert.assertTrue(checker.isPangram(sentence));
    }
}
