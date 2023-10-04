package org.factorial;

public class NumberOperator {
    public static final int MINIMAL_FACTORIAL = 1;

    public int factorial(int number) {
        if (number == MINIMAL_FACTORIAL) {
            return MINIMAL_FACTORIAL;
        }
        return number * factorial(number-1);
    }
}
