package org.inheritance_challenge;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{
    private final double annualSalary;
    private boolean isRetired = false;

    public SalariedEmployee(
            String name,
            LocalDate birthDate,
            long employeeId,
            LocalDate hireDate,
            double annualSalary) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }

    public double annualSalary() {
        return this.annualSalary;
    }

    public boolean isRetired() {
        return this.isRetired;
    }

    public void retire() {
        this.isRetired = true;
    }
}
