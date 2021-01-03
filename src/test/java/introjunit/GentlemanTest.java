package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    void byNormalName(){
        //Gentleman gentleman = new Gentleman("John Doe");
        String name = "John Doe";
        String greeting = new Gentleman().sayHello(name);
        assertEquals("Hello John Doe", greeting);
    }

    @Test
    void test2(){
        assertEquals("Hello John Doe", new Gentleman().sayHello("John Doe"));
    }



}
