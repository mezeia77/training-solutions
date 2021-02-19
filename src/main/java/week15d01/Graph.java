package week15d01;

import java.util.*;

public class Graph {

    public Map<Integer, Integer> findMax(Map<Integer, Integer> input){
        if(input.isEmpty() || input.containsValue(Integer.MIN_VALUE)){
            throw new IllegalArgumentException("No data");
        }

        Map<Integer, Integer> result = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry:input.entrySet()){
            if(max < entry.getValue()){
                result.clear();
                result.put(entry.getKey(), entry.getValue());
                max= entry.getValue();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        List<Integer> keys = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> values = List.of(10, 20, 30, 40, 50, 45, 90, 20);
        for (int i = 0; i< keys.size(); i++){
            integerMap.put(keys.get(i), values.get(i));
        }
        System.out.println(new Graph().findMax(integerMap));
    }
}

//    Adott egy függvénygrafikon a koordináta rendszerben. A grafikon néhány pontját megkapjuk egy Map-ben.
//        A map kulcsa az x koordináta értéke pedig az y koordináta.
//        Döntsük el, hogy a kapott pontok közül, hol van a függvénynek maximum helye és ott mennyi az értéke.