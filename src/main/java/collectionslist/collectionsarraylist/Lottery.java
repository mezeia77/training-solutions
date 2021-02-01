package collectionslist.collectionsarraylist;

import java.util.*;

public class Lottery {

    public List<Integer> create(int lotteryType){
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i<=lotteryType; i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers;
    }

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount){
        if(ballCount>=lotteryType){
            throw new IllegalArgumentException("Balls must be more than the winning numbers");
        }
        List<Integer> ballPool = create(lotteryType);
        List<Integer> winningNumbers = ballPool.subList(0, ballCount);
        Collections.sort(winningNumbers);
        return winningNumbers;
    }
}
