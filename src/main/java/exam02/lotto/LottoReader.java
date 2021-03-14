package exam02.lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LottoReader {

    private InputStream inputStream;

    public LottoReader(InputStream inputStream) {
        this.inputStream = inputStream;
        readFromFile();
    }

    private List<Integer> numbers = new ArrayList<>();

    public void readFromFile(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))){
            String line = "";
            while ((line = br.readLine()) !=null){
            String[] parts = line.split(";");
            for(int i = 11; i<=15; i++){
                numbers.add(Integer.parseInt(parts[i]));
                }
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("File not found");
        }
    }

    public int getNumber(int i) {
        int sum = 0;
        for (Integer integer:numbers){
            if(integer==i){
                sum++;
            }
        }
        return sum;
    }
}
