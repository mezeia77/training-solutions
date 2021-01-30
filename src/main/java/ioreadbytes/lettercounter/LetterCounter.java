package ioreadbytes.lettercounter;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class LetterCounter {
    public static void main(String[] args) {

        Path path = Path.of("src\\main\\resources\\ioreadbytes\\data.dat");
        int sumA = 0;
        try (InputStream inputStream = Files.newInputStream(path)) {
            byte[] buffer = new byte[100];
            int size = 0;
            while ((size = inputStream.read(buffer))>0) {
                for(byte b : buffer){
                    if (b=='a'){
                     sumA++;
                    }
                }
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't read file", ioe);
        }
        System.out.println(sumA);
    }



}
