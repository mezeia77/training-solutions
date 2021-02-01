package collectionsmap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class LogParser {

    public Map<String, List<Entry>> parseLog(String log){
       try (Scanner scanner = new Scanner(log)){
           Map<String, List<Entry>> elements = new HashMap<>();
           while (scanner.hasNext()){
               String line = scanner.next();
               String[] lineElements = line.split(":");
               if(lineElements.length != 3){
                   throw new IllegalArgumentException("Incorrect log: Incorrect number of fields");
               }
               LocalDate entryDate = LocalDate.parse(lineElements[1]);
               fillMap(elements, new Entry(lineElements[0], entryDate, lineElements[2]));
           }
           return elements;
       }
    }

    private void fillMap(Map<String, List<Entry>> elements, Entry entry) {
        if (!elements.containsKey(entry.getIpAddress())) {
            elements.put(entry.getIpAddress(), new ArrayList<>());
        }

        elements.get(entry.getIpAddress()).add(entry);
    }

    private LocalDate parseDate(String date) {
        try {
            return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }
        catch (DateTimeParseException pe) {
            throw new IllegalArgumentException("Incorrect log: incorrect date ", pe);
        }
    }
}
