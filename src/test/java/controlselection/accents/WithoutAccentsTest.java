package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutAccentsTest {
    WithoutAccents withoutAccents = new WithoutAccents();
    @Test
    void woAccentsTest(){
        assertEquals('a', withoutAccents.withoutAccent('a'));
        assertEquals('a', withoutAccents.withoutAccent('á'));
        assertEquals('e', withoutAccents.withoutAccent('e'));
        assertEquals('e', withoutAccents.withoutAccent('é'));
        assertEquals('i', withoutAccents.withoutAccent('i'));
        assertEquals('i', withoutAccents.withoutAccent('í'));
        assertEquals('o', withoutAccents.withoutAccent('o'));
        assertEquals('o', withoutAccents.withoutAccent('ó'));
        assertEquals('o', withoutAccents.withoutAccent('ö'));
        assertEquals('o', withoutAccents.withoutAccent('ő'));
        assertEquals('u', withoutAccents.withoutAccent('u'));
        //assertEquals('u', withoutAccents.withoutAccent('ú'));
        assertEquals('u', withoutAccents.withoutAccent('ü'));
        assertEquals('u', withoutAccents.withoutAccent('ű'));

        assertEquals('d', withoutAccents.withoutAccent('d'));
    }
}
