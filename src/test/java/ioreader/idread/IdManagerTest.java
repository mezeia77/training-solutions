package ioreader.idread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdManagerTest {


    IdManager idManager = new IdManager();


    @Test
    public void getResultTest() {
        assertEquals(0, idManager.getResult().size());
    }


    @Test
    public void readIdFromFileTest() {

        assertEquals(0, idManager.getResult().size());
        idManager.readIdsFromFile("idnumbers.txt");
        assertEquals(3, idManager.getResult().size());

    }

}