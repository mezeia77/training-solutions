package ioreadstring.names;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {

    @Test
    void readFromFileTestWithSeparatedPath() {
        FileManager fm = new FileManager(Path.of("src/main/resources/ioreadstring"), "names.txt");
        fm.readFromFile();
        assertEquals(4, fm.getHumans().size());
        assertEquals("Rambo", fm.getHumans().get(3).getFamilyName());
    }

    @Test
    void readFromFileTestWithFullPath() {
        FileManager fm = new FileManager("src/main/resources/ioreadstring/names.txt");
        fm.readFromFileFullPath();
        assertEquals(4, fm.getHumans().size());
        assertEquals("Rambo", fm.getHumans().get(3).getFamilyName());
    }

    @Test
    void getHumansTest() {
        FileManager fm = new FileManager(Path.of("src/main/resources/ioreadstring"), "names.txt");
        assertEquals(0, fm.getHumans().size());
    }
}