package unit;

import org.junit.Assert;
import org.junit.Test;
import org.method_overriding.CentimetersCalculator;

public class TestCentimetersCalculatorShould {

    @Test
    public void convert_from_inches() throws Exception {
        CentimetersCalculator calculator = new CentimetersCalculator();
        int heightInInches = 200;

        Assert.assertEquals(508, calculator.convert(heightInInches), 1);
    }

    @Test
    public void convert_from_feet_with_remaining_inches() throws Exception {
        CentimetersCalculator calculator = new CentimetersCalculator();
        int heightInFeet = 200, remainingHeightInInches = 30;

        Assert.assertEquals(6172.2, calculator.convert(heightInFeet, remainingHeightInInches), 1);
    }
}
