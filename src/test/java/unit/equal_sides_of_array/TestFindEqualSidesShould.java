package unit.equal_sides_of_array;

import org.equal_sides_of_array.ListTool;
import org.junit.Assert;
import org.junit.Test;

public class TestFindEqualSidesShould {
    @Test
    public void return_zero_when_the_numbers_list_is_empty() throws Exception {
        int[] numbers = {};

        ListTool listTool = new ListTool();

        Assert.assertEquals(0, listTool.findEvenIndexFrom(numbers));
    }
}
