package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ClassManager {

    final Path path = Path.of("src\\main\\resources\\week13d03\\timetable.txt");
    private List<String> all = new ArrayList<>();

    public void readFile() {
        String line;
        try (BufferedReader br = Files.newBufferedReader(path)) {
            while ((line = br.readLine()) != null) {
                all.add(line);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("No such file ", e);
        }
    }

        public int teacherHoursPerWeek (String name){
            int sum = 0;
            for (int i = 0; i < all.size(); i += 4) {
                if(all.get(i).equals(name)){
                    sum += Integer.parseInt(all.get(i+3));
                }
            }
            return sum;
        }


    public static void main(String[] args) {
        ClassManager cm = new ClassManager();
        cm.readFile();
        System.out.println(cm.teacherHoursPerWeek("Albatrosz Aladin"));
        System.out.println(cm.teacherHoursPerWeek("Kutya Kuniginda"));
        System.out.println(cm.teacherHoursPerWeek("Majmocska Maja"));
        System.out.println(cm.teacherHoursPerWeek("Oposszum Opika"));
        System.out.println(cm.teacherHoursPerWeek("Kenguru Kevin"));
        System.out.println(cm.teacherHoursPerWeek("Mormota Molli"));


    }
}
