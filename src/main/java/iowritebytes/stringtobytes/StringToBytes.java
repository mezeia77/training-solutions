package iowritebytes.stringtobytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringToBytes {

    public void writeAsBytes(List<String> input, String file){
        Path path = Path.of("src\\main\\resources\\iowritebytes" + "\\" + file);
        try (BufferedOutputStream bos = new BufferedOutputStream(Files.newOutputStream(path))) {
            for(String s : input){
                if(!s.startsWith("_")){
                    bos.write(s.getBytes());
                }
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write file", ioe);
        }
    }
}
