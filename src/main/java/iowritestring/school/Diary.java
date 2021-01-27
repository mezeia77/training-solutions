package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class Diary {

    private Path folder = Path.of("src/main/resources/iowritestring");

    public void newMark(String name, int number){
        Path file = Path.of(folder + "/" +name + ".txt");
        if(!Files.exists(file)) {
            try {
                Files.writeString(file, (number) + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                Files.writeString(file, number + "\n", StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void average(String name){
        Path file = Path.of(folder + "/" +name + ".txt");
        try {
            List<String> data = Files.readAllLines(file);
            int sum = 0;
            for(String num:data){
                sum += Integer.parseInt(num);
            }
            double average = Math.round((double) sum / data.size());
            try {
                Files.writeString(file, average + "\n", StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
