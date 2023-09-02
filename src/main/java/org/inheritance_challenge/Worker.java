package org.inheritance_challenge;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Worker {
    private String name;
    private LocalDate birthDate;
    private LocalDate endDate;

    public Worker(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return LocalDate.now().minusYears(birthDate.getYear()).getYear();
    }

    public void terminate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }
}
