package w06d03;

import org.junit.jupiter.api.Test;

public class WordEraserTest {

    WordEraser wordEraser = new WordEraser();

    @Test
    public void ifWorks(){
        System.out.println(wordEraser.eraseWord("eme eszperente nem kedvez ENNEK mert neheztel velem", "ne"));

    }
}
