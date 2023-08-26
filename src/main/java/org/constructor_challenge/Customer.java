package org.constructor_challenge;

public class Customer {
    private final String name;
    private final int creditLimit;
    private final String email;

    public Customer() {
        this("Guest", 100, "example@example.net");
    }


    public Customer(String name,  String email) {
        this(name, 100, email);
    }

    public Customer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
