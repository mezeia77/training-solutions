package ioreader.states;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateRegisterTest {

    StateRegister stateRegister = new StateRegister();

    @Test
    public void testGetStates(){
        assertEquals(0,stateRegister.getStates().size());
    }

    @Test
    public void testWithWrongFileName(){
        assertThrows(IllegalStateException.class, ()->stateRegister.readStatesFromFile("myFile.txt"));
    }

    @Test
    public void testReadFile(){
        assertEquals(0,stateRegister.getStates().size());

        stateRegister.readStatesFromFile("stateregister.txt");

        assertEquals(50,stateRegister.getStates().size());
        assertEquals("Wyoming",stateRegister.getStates().get(49).getStateName());
    }

    @Test
    public void wrongStateNameTest(){
        stateRegister.readStatesFromFile("stateregister.txt");
        assertThrows(IllegalArgumentException.class, ()->stateRegister.findCapitalByStateName("Canada"));
    }

    @Test
    public void findCapitalByStateNameTest(){
        stateRegister.readStatesFromFile("stateregister.txt");
        assertEquals("Juneau",stateRegister.findCapitalByStateName("Alaska"));
        assertEquals("Albany",stateRegister.findCapitalByStateName("New York"));
    }

    @Test
    public void findCapitalByStateNameTest2(){
        stateRegister.readStatesFromFile("stateregister.txt");
        assertEquals("Juneau",stateRegister.findCapitalByStateName2("Alaska"));
        assertEquals("Albany",stateRegister.findCapitalByStateName2("New York"));
    }
}