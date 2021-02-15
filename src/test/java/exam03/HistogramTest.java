package exam03;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HistogramTest {
    @Test
    void createHistogram() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("src\\main\\resources\\exam03\\histogram.txt"))) {
            String result = new Histogram().createHistogram(reader);
//            System.out.println(result);
            assertEquals("***\n" +
                    "****\n" +
                    "**\n" +
                    "*\n", result);
        }
    }
}