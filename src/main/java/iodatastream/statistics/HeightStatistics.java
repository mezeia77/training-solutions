package iodatastream.statistics;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HeightStatistics {

    public void saveHeights(List<Integer> input, String filename){
        Path path = Path.of("src\\main\\resources\\iodatastream" + "\\" + filename);
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            dataOutputStream.writeInt(input.size());
            for(int i : input){
                dataOutputStream.writeInt(i);
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write file ", ioe);
        }
    }

    public List<Integer> loadHeights(String filename){
        Path path = Path.of("src\\main\\resources\\iodatastream" + "\\" + filename);
        List<Integer> temp = new ArrayList<>();
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(Files.newInputStream(path)))) {
                temp.add(dataInputStream.readInt());
        } catch (IOException ioe){
            throw new IllegalStateException("No file found ", ioe);
        }
        return temp;
    }
}
