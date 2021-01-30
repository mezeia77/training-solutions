package iozip.employee;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class EmployeeService {

    public static void main(String[] args) {
        Path path = Path.of("src\\main\\resources\\iozip\\data.zip");
        try (ZipOutputStream bos = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            bos.putNextEntry(new ZipEntry("data.dat"));
            for(int i = 0; i<1100; i++) {
                bos.write("abcde".getBytes());
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't write file ", ioe);
        }
    }
}
