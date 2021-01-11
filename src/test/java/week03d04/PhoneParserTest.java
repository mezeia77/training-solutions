package week03d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneParserTest {

    @Test
    void phoneTest(){
        PhoneParser phoneParser= new PhoneParser();
        String s = "30-1234567";

        Phone phone = phoneParser.parse(s);
        assertEquals("30-1234567", phone.toString());
    }
}
