package org.inheritance_challenge;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    private final double hourlyPayRate;
    private static final int WORKING_HOURS = 40;

    public HourlyEmployee(
            String name,
            LocalDate birthDate,
            long employeeId,
            LocalDate hireDate,
            double hourlyPayRate
    ) {
        super(name, birthDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return WORKING_HOURS * hourlyPayRate;
    }

    public double collectDoubledPay() {
        return 2 * collectPay();
    }
}
