package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {

    @Test
    void testGreet(){
        Greetings greetings = new Greetings();
        assertEquals(greetings.greet(4,30), "Jó éjt!");
        assertEquals(greetings.greet(5, 0), "Jó éjt!");
        assertEquals(greetings.greet(5, 1), "Jó reggelt!");
        assertEquals(greetings.greet(9, 0), "Jó reggelt!");
        assertEquals(greetings.greet(9, 1), "Jó napot!");
        assertEquals(greetings.greet(18, 30), "Jó napot!");
        assertEquals(greetings.greet(18, 31), "Jó estét!");
        assertEquals(greetings.greet(20, 00), "Jó estét!");
        assertEquals(greetings.greet(20, 01), "Jó éjt!");
    }
}
