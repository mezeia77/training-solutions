package collectionsmap;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LogParserTest {

    @Test
    public void faultyLogShouldThrowException() {
        String log = "invalid_log_format";
        assertThrows(IllegalArgumentException.class, ()->new LogParser().parseLog(log));
    }

    @Test
    public void invalidDateFormatShouldThrowException() {
        String log = "176.121.45.124:20161202:derzsi\n";
        assertThrows(DateTimeException.class, ()->new LogParser().parseLog(log));
    }

    @Test
    public void entriesWithSameIpShouldBeInSameList() {
        String log = "176.121.45.124:2016-12-02:derzsi\n"
                + "176.121.45.124:2016-12-03:ggrrrr\n";

        Map<String, List<Entry>> entries = new LogParser().parseLog(log);

        assertEquals(1, entries.size());
        assertEquals(2, entries.get("176.121.45.124").size());
        assertEquals("derzsi", entries.get("176.121.45.124").get(0).getLogin());
        assertEquals("176.121.45.124", entries.get("176.121.45.124").get(0).getIpAddress());
        assertEquals(LocalDate.of(2016, 12, 2), entries.get("176.121.45.124").get(0).getDate());
    }

}