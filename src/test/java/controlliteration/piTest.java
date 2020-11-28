package controlliteration;

import controliteration.Pi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class piTest {

    @Test
    public void getPi(){

        assertEquals((new Pi().getPi()), "3141592653589793238462643383279");
    }


}
