package week05d03;


import java.util.ArrayList;
import java.util.List;

public class ListCounter {


    public int counter (List<String> input){
        String temp = input.toString();
        int result=0;

        for (int i=0; i<temp.length(); i++){
            if(temp.toLowerCase().charAt(i)=='a'){
            result++;
            }
        }
        return result;
    }

   /* public static void main(String[] args) {
        ListCounter listCounter = new ListCounter();
        List<String> input = new ArrayList<>();
        input.add("Valami Amerika");
        System.out.println(listCounter.counter(input));

    }*/
}
