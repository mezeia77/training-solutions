package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ToConsonantTest {

    ToConsonant toConsonant = new ToConsonant();

    @Test
    void isVowelTest(){
        assertTrue(toConsonant.isVowel('a'));
        assertFalse(toConsonant.isVowel('b'));
    }

    @Test
    void positionTest(){
        assertEquals(3, toConsonant.position('d'));
    }

    @Test
    void toConsonantTest(){
        assertEquals('b', toConsonant.toConsonant('a'));
        assertEquals('b', toConsonant.toConsonant('b'));
        assertEquals('f', toConsonant.toConsonant('e'));
        assertEquals('g', toConsonant.toConsonant('g'));

    }
    //István:
    @Test
    public void testVowel() {
        assertEquals(new ToConsonant().convertToConsonant('a'), 'b');
        assertEquals(new ToConsonant().convertToConsonant('e'), 'f');
        assertEquals(new ToConsonant().convertToConsonant('i'), 'j');
    }

    @Test
    public void testConsonant() {
        assertEquals(new ToConsonant().convertToConsonant('b'), 'b');
        assertEquals(new ToConsonant().convertToConsonant('g'), 'g');
        assertEquals(new ToConsonant().convertToConsonant('z'), 'z');
        System.out.println((char)(200));
    }
}
