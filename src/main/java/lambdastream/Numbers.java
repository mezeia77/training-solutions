package lambdastream;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    private List<Integer> numbers = new ArrayList<>();

    public Numbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public Optional<Integer> min(){
        return numbers.stream().min(Comparator.naturalOrder());
    }

    public Integer sum(){
        return numbers.stream().reduce(0, (a, b)->a+b);
    }

    public Set<Integer> getDistinctElements() {
        return numbers.stream().collect(Collectors.toSet());
    }

    public boolean isAllPositive(){
        return numbers.stream().allMatch(a -> a>0);
    }
}
