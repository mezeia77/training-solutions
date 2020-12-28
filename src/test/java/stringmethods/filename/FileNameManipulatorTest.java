package stringmethods.filename;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileNameManipulatorTest {

    @Test

    public void identifyFilesByExtension() {

        Assertions.assertEquals(new FileNameManipulator().findFileExtension("List.txt"), ".txt");
    }

    @Test
    public void findLastCharacter() {

        assertEquals(new FileNameManipulator().findLastCharacter("abcdef"), 'f');
        assertEquals(new FileNameManipulator().findLastCharacter("abcdef \t  \n "), 'f');
    }

    @Test
    public void findFileExtension() {

        assertEquals(new FileNameManipulator().findFileExtension("record.dat"), ".dat");
    }

    @Test
    public void compareFilesByName(){

        assertEquals(new FileNameManipulator().compareFilesByName("String.java", "String.JAVA"), true);
        assertEquals(new FileNameManipulator().compareFilesByName("String.java", "Sting.java"), false);
    }

    @Test
    public void changeExtensionToLowerCase(){
        assertEquals(new FileNameManipulator().changeExtensionToLowerCase("String.JAVA"), "String.java");
    }

    @Test
    public void replaceExtension() {
        assertEquals(new FileNameManipulator().replaceStringPart("picture.png", "jpeg", "jpg"), "picture.png");
        assertEquals(new FileNameManipulator().replaceStringPart("picture.jpeg", "jpeg", "jpg"), "picture.jpg");
        assertEquals(new FileNameManipulator().replaceStringPart("long descriptive name.txt", " ", "_"), "long_descriptive_name.txt");
    }
}
