package unit.inheritance_challenge;

import org.inheritance_challenge.Employee;
import org.inheritance_challenge.SalariedEmployee;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.inheritance_challenge.SalariedEmployee.SALARY_REDUCTION_PERCENTAGE;

public class TestSalariedEmployeeShould {
    @Test
    public void have_an_annual_salary_assigned_and_not_be_retired_at_first() throws Exception {
        long employeeId = 1;
        LocalDate hireDate = LocalDate.of(2022, Month.JULY, 1);
        double annualSalary = 2400.50;

        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "Maria",
                LocalDate.of(1994, Month.MARCH, 8),
                employeeId,
                hireDate,
                annualSalary
        );

        Assert.assertEquals(annualSalary, salariedEmployee.annualSalary(), 1);
        Assert.assertFalse(salariedEmployee.isRetired());
    }

    @Test
    public void be_able_to_retire() throws Exception {
        long employeeId = 1;
        LocalDate hireDate = LocalDate.of(2022, Month.JULY, 1);
        double annualSalary = 2400.50;

        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "Maria",
                LocalDate.of(1994, Month.MARCH, 8),
                employeeId,
                hireDate,
                annualSalary
        );
        salariedEmployee.retire();

        Assert.assertTrue(salariedEmployee.isRetired());
    }

    @Test
    public void be_able_to_collect_its_full_pay_when_is_not_retired() throws Exception {
        long employeeId = 1;
        LocalDate hireDate = LocalDate.of(2022, Month.JULY, 1);
        double annualSalary = 24000.50;

        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "Maria",
                LocalDate.of(1994, Month.MARCH, 8),
                employeeId,
                hireDate,
                annualSalary
        );

        Assert.assertEquals(annualSalary / Month.values().length, salariedEmployee.collectPay(), 1);
    }

    @Test
    public void be_able_to_collect_its_reduced_pay_when_is_retired() throws Exception {
        long employeeId = 1;
        LocalDate hireDate = LocalDate.of(2022, Month.JULY, 1);
        double annualSalary = 24000.50;

        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "Maria",
                LocalDate.of(1994, Month.MARCH, 8),
                employeeId,
                hireDate,
                annualSalary
        );
        salariedEmployee.retire();

        double salaryReduced = (annualSalary - (annualSalary * SALARY_REDUCTION_PERCENTAGE)) / Month.values().length;
        Assert.assertEquals(salaryReduced, salariedEmployee.collectPay(), 1);
    }
}
