package stringscanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringScanner {

    Scanner scanner = new Scanner(System.in);


    public boolean isEmpty(String str){
        if (str == null || "".equalsIgnoreCase(str)){
            throw new IllegalArgumentException("Must not be empty");
        }
        return false;
    }

    public int readAndSumValues(String intString, String delimiter){
        try (Scanner scanner = new Scanner(intString)){
            if (!isEmpty(delimiter)){
                scanner.useDelimiter(delimiter);
            }
            return calculateWithScanner(scanner);
        }
    }

    public int readAndSumValues(String intString){
        return readAndSumValues(intString, null);
    }

    public int calculateWithScanner(Scanner sc) {
        int sum = 0;
        try {
            while (sc.hasNext()) {
                sum = sum + sc.nextInt();
            }
        } catch (InputMismatchException ex) {
            throw new IllegalArgumentException("Wrong parameter string!", ex);
        }
        return sum;
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        if (isEmpty(text) || word == null || "".equalsIgnoreCase(word)) {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        try (Scanner sc = new Scanner(text)) {
            StringBuilder sb = new StringBuilder();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.contains(word)) {
                    sb.append(line);
                    sb.append("\n");
                }
            }
            return sb.toString().trim();
        }
    }

}
