package stringmethods.url;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrlManagerTest {

    @Test
    void testCreate() {

        String url = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";

        UrlManager urlManager = new UrlManager(url);

        assertEquals("https", urlManager.getProtocol());
        assertEquals("earthquake.usgs.gov", urlManager.getHost());
        assertEquals("/fdsnws/event/1/query", urlManager.getPath());
        assertNull(urlManager.getPort());
    }

    @Test
    void testCreateWithPortAtEnd() {

        String url = "HTTPS://EarthQuake.USgs.gov:80";

        UrlManager urlManager = new UrlManager(url);

        assertEquals("https", urlManager.getProtocol());
        assertEquals("earthquake.usgs.gov", urlManager.getHost());
        assertEquals("", urlManager.getPath());
        assertEquals(Integer.valueOf(80), urlManager.getPort());
    }

    @Test
    void testCreateWithPort() {

        String url = "HTTPS://EarthQuake.USgs.gov:80/query?a=4";

        UrlManager urlManager = new UrlManager(url);

        assertEquals("https", urlManager.getProtocol());
        assertEquals("earthquake.usgs.gov", urlManager.getHost());
        assertEquals("/query", urlManager.getPath());
        assertEquals(Integer.valueOf(80), urlManager.getPort());
    }

//    @Test
//    void testCreateMissingHost() {
//        exception.expect(IllegalArgumentException.class);
//        exception.expectMessage("Invalid url");
//
//        new UrlManager("http://");
//    }

//    @Test
//    void testCreateMissingProtocol() {
//        exception.expect(IllegalArgumentException.class);
//        exception.expectMessage("Invalid url");
//
//        new UrlManager("www.google.com");
//    }

    @Test
    void testHasProperty() {
        String url = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";

        UrlManager urlManager = new UrlManager(url);

        assertTrue(urlManager.hasProperty("format"));
    }

    @Test
    void testHasPropertyMissing() {
        String url = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";

        UrlManager urlManager = new UrlManager(url);

        assertFalse(urlManager.hasProperty("place"));
    }

    @Test
    void testHasPropertyForKeypart() {
        String url = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";

        UrlManager urlManager = new UrlManager(url);

        assertFalse(urlManager.hasProperty("time"));
    }

//    @Test
//    void testHasPropertyWithNull() {
//        String url = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
//        UrlManager urlManager = new UrlManager(url);
//
//        exception.expect(IllegalArgumentException.class);
//
//        urlManager.hasProperty(null);
//    }

    @Test
    void testGetProperty() {
        String url = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";

        UrlManager urlManager = new UrlManager(url);

        assertEquals("geojson", urlManager.getProperty("format"));
    }

    @Test
    void testGetPropertyMissing() {
        String url = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";

        UrlManager urlManager = new UrlManager(url);

        assertNull(urlManager.getProperty("place"));
    }

    @Test
    void testGetPropertyForKeyPart() {
        String url = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";

        UrlManager urlManager = new UrlManager(url);

        assertNull(urlManager.getProperty("time"));
    }


//    @Test
//    void testGetPropertyWithBlankParameter() {
//        String url = "HTTPS://EarthQuake.USgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
//        UrlManager urlManager = new UrlManager(url);
//
//        exception.expect(IllegalArgumentException.class);
//
//        urlManager.hasProperty("  ");
//    }
}
