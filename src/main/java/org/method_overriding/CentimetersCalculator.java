package org.method_overriding;

public class CentimetersCalculator {
    public static final double FEET_TO_CM = 30.48;
    public static final double INCHES_TO_CM = 2.54;

    public double convert(int inches) {
        return inches * INCHES_TO_CM;
    }

    public double convert(int feet, int inches) {
        return (feet * FEET_TO_CM) + convert(inches);
    }
}
