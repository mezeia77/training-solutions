package statemachine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypeWriterTest {

    @Test
    void typeWriterTest(){
        assertEquals(TypeWriter.LOWERCASE, TypeWriter.UPPERCASE.next());
        assertEquals(TypeWriter.UPPERCASE, TypeWriter.LOWERCASE.next());
    }
}
