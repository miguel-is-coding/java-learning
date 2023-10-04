package unit.factorial;

import org.factorial.NumberOperator;
import org.junit.Assert;
import org.junit.Test;

public class TestFactorialShould {
//    The factorial function multiplies all the integers and positive
//    numbers between the number that arrives by parameter and the number 1.
// 1 => 1
// 2 => 2
// 3 => 6
// 4 => 24

    @Test
    public void give_1_when_given_number_is_1() {
        int number = 1;

        NumberOperator numberOperator = new NumberOperator();

        Assert.assertEquals(1, numberOperator.factorial(number));
    }

    @Test
    public void give_2_when_given_number_is_2() {
        int input = 2;

        NumberOperator numberOperator = new NumberOperator();

        Assert.assertEquals(2, numberOperator.factorial(input));
    }

    @Test
    public void give_6_when_given_number_is_3() {
        int input = 3;

        NumberOperator numberOperator = new NumberOperator();

        Assert.assertEquals(6, numberOperator.factorial(input));
    }
}
