package ioreadbytes.matrix;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MatrixReader {

    List<byte[]> bytes = new ArrayList<>();

    public List<byte[]> getBytes() {
        return new ArrayList<>(bytes);
    }

    public void readBytes(String filename){
        Path path = Path.of("src\\main\\resources\\ioreadbytes" + "\\" + filename);
        try (InputStream inputStream = Files.newInputStream(path)) {
            byte[] buffer = new byte[1000];
            int size = 0;
            while ((size= inputStream.read(buffer))>0){
                bytes.add(buffer);
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't read file", ioe);
        }
    }

    public int numberOfColumnsWhereMoreZeros() {
        int numOfColumns = 0;
        for (int i = 0; i < 1000; i++) {
            int zeros = 0;
            int ones = 0;

            for (int j = 0; j < bytes.size(); j++) {

                if (bytes.get(j)[i] == 48) {
                    zeros++;
                } else {
                    ones++;
                }
            }
            if (zeros > ones) {
                numOfColumns++;
            }
        }

        return numOfColumns;
    }

}
