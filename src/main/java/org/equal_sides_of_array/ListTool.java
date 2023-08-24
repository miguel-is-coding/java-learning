package org.equal_sides_of_array;

import java.util.Arrays;

public class ListTool {
    public int findEvenIndexFrom(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        for (int index = 0; index < numbers.length; index++) {
            int sumFromLeftSide = Arrays.stream(numbers, 0, index).sum();
            int sumFromRightSide = Arrays.stream(numbers, index+1, numbers.length).sum();
            if (sumFromLeftSide == sumFromRightSide) {
                return index;
            }
        }
        return -1;
    }
}
