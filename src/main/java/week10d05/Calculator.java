package week10d05;

import java.util.Arrays;

public class Calculator {

    public int findMinSum(int[] arr) {
        int result = 0;

        if (arr.length <= 4) {
            for (int i : arr) {
                result += i;
            }
            return result;
        }

        Arrays.sort(arr);

        for (int i = 0; i < 4; i++) {
            result += arr[i];
        }
        return result;
    }
}
