package exam02.lotto;

import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class LottoReaderTest {
    @Test
    public void testCreate() {
        InputStream inputStream = LottoReader.class.getResourceAsStream("/exam02/otos.csv");
        LottoReader lottoReader = new LottoReader(inputStream);
        assertEquals(190, lottoReader.getNumber(1));
        assertEquals(148, lottoReader.getNumber(5));
        assertEquals(185, lottoReader.getNumber(22));
        assertEquals(172, lottoReader.getNumber(90));
    }
}