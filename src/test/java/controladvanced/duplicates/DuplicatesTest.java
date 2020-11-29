package controladvanced.duplicates;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicatesTest {

    @Test

    void find(){
        assertEquals(Arrays.asList(5,1), (new Duplicates().find(Arrays.asList(0,1,2,3,4,5,6,7,8,9, 5,1))));

    }

}
