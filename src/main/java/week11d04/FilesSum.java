package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesSum {

    public int sumNumbers(){
        String fileNumber = "";
        int result = 0;
        for(int i = 0; i<=9; i++){
            for(int j= 0; j<=9; j++){
                fileNumber = Integer.toString(i)+ j;
                String fileName = "number" + fileNumber + ".txt";
                Path path = Path.of("src/main/resources/week11d04/", fileName);
                if(Files.isRegularFile(path)==true){
                    try {
                        String n = Files.readString(path);
                        result += Integer.parseInt(n);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return result;
    }
}
