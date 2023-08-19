package unit.detect_the_pangram;

import org.detect_the_pangram.PangramChecker;
import org.junit.Assert;
import org.junit.Test;

public class TestPangramCheckerShould {
//    ! sentence.includes(alphabet) -> return false
//    sentence.includes(alphabet) -> return true

    @Test
    public void detect_a_text_that_is_not_a_pangram() throws Exception {
        String text = "This is not a pangram";

        PangramChecker checker = new PangramChecker();

        Assert.assertFalse(checker.isPangram(text));
    }
}
