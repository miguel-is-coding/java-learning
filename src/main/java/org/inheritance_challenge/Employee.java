package org.inheritance_challenge;

import java.time.LocalDate;

public class Employee extends Worker{
    private final long employeeId;
    private final LocalDate hireDate;

    public Employee(String name, LocalDate birthDate, long employeeId, LocalDate hireDate) {
        super(name, birthDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
}
