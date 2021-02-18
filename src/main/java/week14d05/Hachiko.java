package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Hachiko {

    public Map<String, Integer> countWords(String filename, String... words) {
        Path file = Path.of("src\\main\\resources\\week14d05" + "\\" + filename);
        Map<String, Integer> result = new HashMap<>();
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line = "";
            while ((line = br.readLine()) != null) {
                for(String word: words){
                    mapCount(result, line, word);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't find file", e);
        } return result;
    }

    private void mapCount(Map<String, Integer> result, String line, String word) {
        if(line.toLowerCase().contains(word.toLowerCase())) {
        if(result.containsKey(word)){
            result.put(word, result.get(word)+1);
        } else {
            result.put(word, 1);
        }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Hachiko().countWords("Hachiko.txt","Hachi", "haza", "pályaudvar", "jó"));
    }

}

//    A examples/week14d05/hachiko.srt van a Hachiko film felirata. Írj egy
//        countWords() metódust, mely paraméterül várja a fájlt, varargsban
//        szavakat. Megszámolja, hogy melyik szó hány sorban szerepel a
//        szövegben. Legyenek mondjuk a beadott szavak: "Hachiko", "haza",
//        "pályaudvar", "jó"
//        ## Senior
//        A examples/week14d05/hachiko.srt van a Hachiko film felirata. Csak streamek
//        használatával számold ki, hogy hányszor hangzik el a kutya neve a filmben!
//        Segítség: a Files.lines() adja vissza a fájl sorait streamben.