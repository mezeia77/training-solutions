package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test

    void ChangeLetters(){
        ChangeLetter changeLetter = new ChangeLetter();
        assertEquals(changeLetter.changeVowels("vAlami"),"v*l*m*");
    }



}
