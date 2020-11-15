package debug.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberStatistics {

    private List<Integer> numbers;

    public NumberStatistics(List<Integer> numbers) {
        this.numbers = numbers;
    }


    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int sumPositives() {
        int sum = 0;
        for(int n: numbers) {
            if(n >= 0) {
                sum += n;
            }
        }
        return sum;
    }

    public int minDifferenceBetweenNeighbours() {
        int minDifference = numbers.get(0) - numbers.get(1) >= 0 ? numbers.get(0) - numbers.get(1) : numbers.get(1) - numbers.get(0);
        for (int i = 1; i < numbers.size() - 1; i++) {
            int actDifference = numbers.get(i) - numbers.get(i + 1)>=0 ? numbers.get(i) - numbers.get(i + 1) : numbers.get(i+1) - numbers.get(i);
            if (actDifference < minDifference) {
                minDifference = actDifference;
            }
        }
        return minDifference;
    }

    public static void main(String[] args) {
        NumberStatistics statistics = new NumberStatistics(Arrays.asList(4, 8, -1, -2, 4, 5, 3));
        int sum = statistics.sumPositives();
        int minDifference = statistics.minDifferenceBetweenNeighbours();
        System.out.println("Sum: " + sum);
        System.out.println("Minimal difference between neighbours: " + minDifference);

        NumberStatistics statistics2 = new NumberStatistics(Arrays.asList(-3, -4));
        int sum2 = statistics2.sumPositives();
        System.out.println("Sum 2: " + sum2);

        NumberStatistics statistics3 = new NumberStatistics(Arrays.asList(1));
        statistics3.minDifferenceBetweenNeighbours();  //Should throw IllegalStateException
    }
}


