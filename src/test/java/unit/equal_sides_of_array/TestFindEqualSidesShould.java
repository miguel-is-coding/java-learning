package unit.equal_sides_of_array;

import org.equal_sides_of_array.ListTool;
import org.junit.Assert;
import org.junit.Test;

public class TestFindEqualSidesShould {
    @Test
    public void retrieve_zero_when_the_numbers_list_is_empty() throws Exception {
        int[] numbers = {};

        ListTool listTool = new ListTool();

        Assert.assertEquals(0, listTool.findEvenIndexFrom(numbers));
    }

    @Test
    public void retrieve_minus_one_when_the_numbers_list_of_size_two_does_not_have_any_even_index() throws Exception {
        int[] numbers = {1,2};

        ListTool listTool = new ListTool();

        Assert.assertEquals(-1, listTool.findEvenIndexFrom(numbers));
    }
}
