package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Shopping {

    private static Map<String, List<String>> listMap = new HashMap<>();


    private void readFile(String filename) {
        Path file = Path.of("src/main/resources/week14d02" + "\\" + filename);
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(" ");
                String id = temp[0];
                String values = temp[1];
                List<String> goods = new ArrayList<>();
                temp = values.split(",");
                for (String s: temp){
                goods.add(s);
                }
                listMap.put(id, goods);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't find file");
        }
    }

    public Collection<String> shopInOrder (String id){
        List<String> result = listMap.get(id);
        Collections.sort(result);
        return result;
    }

    public int goodsQuantity (String goods){
        int result= 0;
        List<String> temp;
        for (Map.Entry entry: listMap.entrySet()){
            temp = (List<String>) entry.getValue();
            if(temp.contains(goods)){
                result++;
            }
        }
        return result;
    }

    public int shopQuantity (String id){
        List<String> result;
        result = listMap.get(id);
        return result.size();
    }

    public Map<String, Integer> goodsStatistics(){
        Map<String, Integer> result = new HashMap<>();
        for(List<String> temp : listMap.values()){
            for (String s : temp){
                if(result.containsKey(s)){
                    result.put(s, result.get(s) + 1);
                } else {
                    result.put(s, 1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new Shopping().readFile("list.csv");
//        System.out.println(listMap);
        System.out.println(new Shopping().shopInOrder("A312"));
        System.out.println(new Shopping().shopQuantity("A312"));
        System.out.println(new Shopping().goodsQuantity("passata"));
        System.out.println(new Shopping().goodsStatistics());
    }

}

//    Adott egy fájl melyben online bevásárlások találhatók. A fájl a még ki nem szállított rendeléseket tartalmazza.
//        Egy sorban egy egyedi azonosító és utána a termékek neve van felsorololva. Minden vásárlás legalább 2 termékből áll.
//
//        A233 bread,tomato,flour,sugar
//        A312 sugar,beer,apple,pear
//        B3402 meet,soda,cola,bbq_sauce
//        B341 pasta,passata,basil,cheese
//        A10 corn,hot_dog,rolls
//        CM231 beer,chips
//        C123 pepper,salt,rosmary,pizza_dough,passata,oregano
//        W34111 pasta,sugar,rosmary,cheese,meet,carrot,potato,tomato
//        K8921 wine,soda
//        Olvasd be a fájlt és tárold el az adatokat a memóriában, majd oldd meg a következő feladatokat.
//
//        Egyedi azonosító alapján legyenek lekérdezhetőek a vásárolt termékek ABC sorrendben.
//        Számoljuk össze, egy termék neve alapján, hogy abból a termékből mennyit adtak el.
//        Adjuk vissza egy vásárlási azonosító alapján, hogy hány termék szerepel a vásárlásban.
//        Készíts statisztikát melyben visszaadod, hogy az egyes termékek hányszor szerepelnek a fájlban.
