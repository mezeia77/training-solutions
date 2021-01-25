package iowriter.names;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NameWriter {

    private String filename;
    private Path path = Path.of("src\\main\\resources\\iowriter");

    public NameWriter(String filename) {
        this.filename = filename;
    }

    private void addAndWrite(String name){
        Path fullPath = Path.of(path + "\\" + filename);
        if(Files.isRegularFile(fullPath)) {
            try (BufferedWriter writer = Files.newBufferedWriter(fullPath, StandardOpenOption.APPEND)) {
                writer.write(name);
                writer.newLine();
            } catch (IOException e) {
                throw new IllegalStateException("Error ", e);
            }
        } else try (BufferedWriter writer = Files.newBufferedWriter(fullPath)) {
            writer.write(name);
            writer.newLine();
        } catch (IOException e) {
            throw new IllegalStateException("Error ", e);
        }
    }

    public static void main(String[] args) {
        NameWriter nameWriter = new NameWriter("namewriter.txt");
        nameWriter.addAndWrite("John Doe");
    }
}
