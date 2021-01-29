package iowritebytes.stringtobytes;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringToBytesTest {

    @Test
    void writeAsBytesTest() {
        List<String> words = List.of("John", "_notes", "_Does not matter", "Jack", "Jane");
        StringToBytes stringToBytes = new StringToBytes();
        stringToBytes.writeAsBytes(words, "words.dat");
    }
}