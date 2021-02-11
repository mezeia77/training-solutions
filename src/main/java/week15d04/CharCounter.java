package week15d04;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CharCounter {
    private static final String VOWEL="AEIOU";
    private static final String CONSONANT="BCDFGHJKLMNPQRSTVWXYZ";
    private List<String> data = new ArrayList<>();

    private void readFile(String filename) {
        Path file = Path.of("src\\main\\resources\\week15d04" + "\\" + filename);
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line = "";
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't find file");
        }
    }

    public String counter(String filename){
        readFile(filename);
        String result = "";
        int vow = 0;
        int cons = 0;
        int charNumber = 0;
        for (String s:data){
            for (int i = 0; i<s.length(); i++) {
                String c = String.valueOf(s.charAt(i)).toUpperCase();
                if(!c.equals(" ")) {
                    if (VOWEL.contains(c)) {
                        vow++;
                    }
                    if (CONSONANT.contains(c)) {
                        cons++;
                    }
                    charNumber++;
                }
            }
        }
        result = "vowel: " + vow + "\n"
        + "consonant: " + cons + "\n"
        + "other: " + (charNumber-(vow+cons));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new CharCounter().counter("a.csv"));
    }
}

//    Számoljuk össze, hogy egy fájlban hány mássalhangzó, hány magánhangzó és hány egyéb karakter van.
//        A space-eket ne vegyük figyelembe! A kis- és nagybetű különbség nem számít!
//        Remélem a juniorok is meg tudják oldani, azonban a senoiroknak streammel kell.
