package week16d01;

import javax.xml.stream.events.Characters;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class VowelFilter {
    private final String  VOWEL_LIST="AÁEÉIÍOÓÖŐÜŰ";
    private static List<String> vowels=new ArrayList<>();

    private void readFile(String filename) {
        Path file = Path.of("src\\main\\resources\\week16d01" + "\\" + filename);
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line = "";
            while ((line = br.readLine()) != null) {
                vowels.add(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't find file");
        }
    }

    public String filterVowels(){
        StringBuilder sb = new StringBuilder();
        for (String s:vowels){
            for(int i = 0; i<s.length(); i++) {
                String temp = Character.toString(s.charAt(i));
                if(!VOWEL_LIST.contains(temp.toUpperCase())){
                    sb.append(s.charAt(i));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        new VowelFilter().readFile("text.txt");
        System.out.println(vowels);
        new VowelFilter().filterVowels();
    }
}
