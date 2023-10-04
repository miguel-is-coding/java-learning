package org.factorial;

public class NumberOperator {
    public static final int MINIMAL_FACTORIAL = 1;

    public int factorial(int number) {
        int factorialResult = MINIMAL_FACTORIAL;
        for (int factor = 1; factor <= number; factor++) {
            factorialResult *= factor;
        }
        return factorialResult;
    }
}
