package defaultconstructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleDateFormatterTest {
    private SimpleDate simpleDate;

//    @Before
    public void setUp() {
        simpleDate = new SimpleDate();
        simpleDate.setDate(2016, 2, 29);
    }
//
//    @After
//    public void tearDown() {
//        simpleDate = null;
//    }

    @Test
    public void testFormatDateStringByCountryCodeHU() {
        simpleDate = new SimpleDate();
        simpleDate.setDate(2016, 2, 29);
        assertEquals(new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.HU, simpleDate), "2016-2-29");
    }

    @Test
    public void testFormatDateStringByCountryCodeEN() {
        simpleDate = new SimpleDate();
        simpleDate.setDate(2016, 2, 29);
        assertEquals(new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.EN, simpleDate), "29-2-2016");
    }

    @Test
    public void testFormatDateStringByCountryCodeUS() {
        simpleDate = new SimpleDate();
        simpleDate.setDate(2016, 2, 29);
        assertEquals(new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.US, simpleDate), "2-29-2016");
    }

    @Test
    public void testFormatDateString() {
        simpleDate = new SimpleDate();
        simpleDate.setDate(2016, 2, 29);
        assertEquals(new SimpleDateFormatter().formatDateString(simpleDate), "2016-2-29");
    }
}
