package unit.inheritance_challenge;

import org.inheritance_challenge.HourlyEmployee;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class TestHourlyEmployeeShould {
    @Test
    public void have_a_paycheck_after_work_one_day() throws Exception {
        long employeeId = 1;
        LocalDate hireDate = LocalDate.of(2022, Month.JULY, 1);
        double hourlyPayRate = 10;

        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Maria",
                LocalDate.of(1994, Month.MARCH, 8),
                employeeId,
                hireDate,
                hourlyPayRate
        );

        Assert.assertEquals(400, hourlyEmployee.collectPay(), 1);
    }

    @Test
    public void have_his_paycheck_doubled() throws Exception {
        long employeeId = 1;
        LocalDate hireDate = LocalDate.of(2022, Month.JULY, 1);
        double hourlyPayRate = 10;

        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Maria",
                LocalDate.of(1994, Month.MARCH, 8),
                employeeId,
                hireDate,
                hourlyPayRate
        );

        Assert.assertEquals(800, hourlyEmployee.collectDoubledPay(), 1);
    }
}
