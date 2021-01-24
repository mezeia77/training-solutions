package ioreader.states;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {
    State state = new State("Washington", "Olympia");

    @Test
    void getStateName() {
        assertEquals("Washington", state.getStateName());
    }

    @Test
    void getCapital() {
        assertEquals("Olympia", state.getCapital());
    }
}