package org.inheritance_challenge;

import java.time.LocalDate;
import java.time.Month;

public class SalariedEmployee extends Employee{
    public static final double SALARY_REDUCTION_PERCENTAGE = 0.1;
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

    @Override
    public double collectPay() {
        if (this.isRetired()) {
            double annualSalaryReduced = this.annualSalary * SALARY_REDUCTION_PERCENTAGE;
            return (this.annualSalary - annualSalaryReduced) / Month.values().length;
        } else {
            return this.annualSalary / Month.values().length;
        }
    }
}
