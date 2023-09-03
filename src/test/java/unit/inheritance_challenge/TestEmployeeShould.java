package unit.inheritance_challenge;

import org.inheritance_challenge.Employee;
import org.inheritance_challenge.Worker;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class TestEmployeeShould {
    @Test
    public void have_an_employee_id_and_hire_date_assigned() throws Exception {
        int employeeId = 1;
        LocalDate hireDate = LocalDate.of(2022, Month.JULY, 1);

        Employee employee = new Employee(
                "Maria",
                LocalDate.of(1994, Month.MARCH, 8),
                employeeId,
                hireDate
        );

        Assert.assertEquals(employeeId, employee.getEmployeeId());
        Assert.assertTrue(hireDate.isEqual(employee.getHireDate()));
    }
}
