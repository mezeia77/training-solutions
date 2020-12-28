package filescanner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class BucketList {

    public static void main(String[] args) {
        //try (Scanner scanner = new Scanner(Path.of("C:/training/training-solutions/src/main/resources/book.txt"))) {
        try (Scanner scanner = new Scanner(BucketList.class.getResourceAsStream("/book.txt"))) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
//        catch (IOException ioe) {
//            throw new IllegalStateException("Cannot read file");
//        }
    }

}
