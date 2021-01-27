package week12d03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    public int numberAlone(List<Integer> numbersList){
        if(numbersList.isEmpty()){
            throw new IllegalStateException("No numbers!");
        }

        List<Integer> arrangedNumbersList =new ArrayList<>(numbersList);
        Collections.sort(arrangedNumbersList);

        int max = 0;

        if(arrangedNumbersList.size()>= arrangedNumbersList.get(arrangedNumbersList.size()-1)){
            max = arrangedNumbersList.size();
        } else max = arrangedNumbersList.get(arrangedNumbersList.size()-1);

        int[] arrangedArray = new int[max+1];

        for(int number: arrangedNumbersList){
            arrangedArray[number]++;
        }

        int result = 0;

        for(int i = arrangedArray.length-1; i>=0; i--){
            if(arrangedArray[i]==1){
                result = i;
            }
        }
        return result;
    }

    public int numberAlone2(List<Integer> numbersList){
        if(numbersList.isEmpty()){
            throw new IllegalStateException("No numbers!");
        }

        int max = 0;
        int maxIndex=0;

        for (int i = 0; i<numbersList.size(); i++){
            if(numbersList.get(i)>max){
                max=numbersList.get(i);
                maxIndex=i;
            }
        }

        if(numbersList.size()>= numbersList.get(maxIndex)){
            max = numbersList.size();
        } else max = numbersList.get(maxIndex);

        int[] arrangedArray = new int[max+1];

        for(int number: numbersList){
            arrangedArray[number]++;
        }

        int result = 0;

        for(int i = arrangedArray.length-1; i>=0; i--){
            if(arrangedArray[i]==1){
                result = i;
            }
        }
        return result;
    }

    public int numberAlone3(List<Integer> numbersList){
        if(numbersList.isEmpty()){
            throw new IllegalStateException("No numbers!");
        }

        if(numbersList.size()==1){
            return numbersList.get(0);
        }

        List<Integer> arrangedNumbersList =new ArrayList<>(numbersList);
        Collections.sort(arrangedNumbersList);

        int result = arrangedNumbersList.get(0);
        if(result< arrangedNumbersList.get(1)){
            return result;
        }

        for(int i = 1; i<arrangedNumbersList.size(); i++){
            if(arrangedNumbersList.get(i)>arrangedNumbersList.get(i-1) && arrangedNumbersList.get(i)<arrangedNumbersList.get(i+1)){
                return arrangedNumbersList.get(i);
            }
        }
        return result;
    }

//    Készítsd el a week12d03.NumberStat osztályt melyben legyen egy metódus, ami paraméterül vár egy egész számokból
//    álló listát. Add vissza azt a számot amelyik pontosan egyszer szerepel a listában. Ha több ilyen szám van akkor
//    a kisebbet! Ellenőrizd, hogy olyan listát fogadunk el, ami legalább 1 elemű, ha a lista nem ilyen, dobj kivételt!
//    pl: {1,1,5,3,4,5,6,5,6,4,1,6,5,4} A megoldás: 3
//    Bónusz: Módosítsd az osztályt. Legyen egy egész számokból álló lista attribútuma. A fent megírt metódus ezen
//    a listán dolgozzon. A lista elemeit fájlból töltsük fel. A file úgy néz ki, hogy egy sorban három szám van
//    vesszővel elválasztva. Tehát:
//            1,1,4
//            2,3,5
//            2,2,5 (edited)
}
