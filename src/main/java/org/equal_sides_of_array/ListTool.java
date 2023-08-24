package org.equal_sides_of_array;

public class ListTool {
    public int findEvenIndexFrom(int[] numbers) {
        int indexFoundAt = 0;
        if (numbers.length == 0) {
            return 0;
        }
        if (numbers[0] != numbers[1]) {
            indexFoundAt = -1;
        }
        return indexFoundAt;
    }
}
