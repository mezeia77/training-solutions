package ioreadstring.names;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private String fileName;
    private Path destination;
    private Path fullPath;

    private List<Human> humans = new ArrayList<>();

    public FileManager(String fileFullPath) {
        this.fullPath = Path.of(fileFullPath);
    }

    public FileManager(Path destination, String fileName) {
        this.fileName = fileName;
        this.destination = destination;
    }

    public void readFromFile() {
        try {
            Path file = Path.of(String.valueOf(destination), fileName);
            List<String> names =Files.readAllLines(file);
            for(String s : names){
                String[] namesPart=s.split(" ");
                Human human = new Human(namesPart[0], namesPart[1]);
                humans.add(human);
            }
        } catch (IOException e) {
            throw new IllegalStateException("File not found", e);
        }
    }

    public void readFromFileFullPath() {
        try {
            Path file = Path.of(String.valueOf(fullPath));
            List<String> names =Files.readAllLines(file);
            for(String s : names){
                String[] namesPart=s.split(" ");
                Human human = new Human(namesPart[0], namesPart[1]);
                humans.add(human);
            }
        } catch (IOException e) {
            throw new IllegalStateException("File not found", e);
        }
    }

    public List<Human> getHumans() {
        return humans;
    }
}
