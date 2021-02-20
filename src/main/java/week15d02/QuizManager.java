package week15d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class QuizManager {

    private static List<Quiz> quizList = new ArrayList<>();
    private static List<String> strings = new ArrayList<>();

    public void fillFromFile(String filename) {
        Path filePath = Path.of("src/main/resources/week15d02" + "\\" + filename);
        try (BufferedReader br = Files.newBufferedReader(filePath)) {
            String line;
            String answer= "";
            String[] temp= new String[3];
                while ((line = br.readLine()) != null) {
                    strings.add(line);
                }
        } catch (IOException e) {
            throw new IllegalStateException("Can't find file ", e);
        }
    }

    public static void main(String[] args) {
        new QuizManager().fillFromFile("kerdesek.txt");
        System.out.println(strings);
        new QuizManager().process();
        System.out.println(quizList);
    }
}
