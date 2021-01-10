package week03d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void getResult() {
        Operation operation = new Operation("12+68");
        assertEquals(80, operation.getResult());
    }

    @Test
    void getResultWithSpaces() {
        Operation operation = new Operation("   12 +   68     ");
        assertEquals(80, operation.getResult());
    }
}