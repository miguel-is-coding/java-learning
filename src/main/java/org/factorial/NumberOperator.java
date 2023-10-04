package org.factorial;

public class NumberOperator {
    public int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        int factorialResult = 1;
        for (int i = 1; i <= number; i++) {
            factorialResult *= i;
        }
        return factorialResult;
    }
}
