package stringconcat.stringconcat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static stringconcat.stringconcat.Title.*;

public class NameTest {

    @Test
    void fullNameTest() {
        Name name = new Name("Kiss", "Károly", "Norbert", Prof);
        System.out.println(name.concatNameHungarianStyle());
        System.out.println(name.concatNameWesternStyle());
    }

    @Test
    void nameTest(){
        Name name = new Name ("Kiss", "", "Norbert");
        System.out.println(name.concatNameHungarianStyle());
        System.out.println(name.concatNameWesternStyle());
    }

//    @Test
//    void nameTestEmpty() {
//        //Given
//        Exception exception = assertEquals (IllegalArgumentException.class, ()->{
//
//                }
//        String expectMessage ="Family name and given name must not be empty!";
//        String actualMessage = exception.getMessage();
//
//        assertTrue(actualMessage.contains(expectedMessage));
//        // When
//        new Name("", "G", "John", Title.MR);
//    }

}
