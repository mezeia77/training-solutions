package exam04retake02.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {


    public int encode(String input, char x) {
        if(x!='0' && x!='1' && x!='x' && x!='X'){
            throw new IllegalArgumentException("Only 0-1-x allowed");
        }
        int result=0;
        Path path = Path.of(input);
        try {
            BufferedReader br = Files.newBufferedReader(path);
            String line = "";
            while ((line=br.readLine())!=null){
                result = counter(x, result, line);
            }

        } catch (IOException ioException) {
            throw new IllegalStateException("File not found", ioException);
        }
        return result;
    }

    private int counter(char x, int result, String line) {
        for (int i = 0; i< line.length(); i++){
            if(line.charAt(i)== x) {
                result++;
            }
        }
        return result;
    }
}
