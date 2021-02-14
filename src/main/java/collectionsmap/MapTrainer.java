package collectionsmap;

import java.util.*;

public class MapTrainer {
    public static void main(String[] args) {

        Map<String, String> codes = new LinkedHashMap<>();

        System.out.println("size: " + codes.size());
        System.out.println(codes);

        codes.put("200", "OK");
        codes.put("404", "Not found");
        System.out.println(codes.size());
        System.out.println(codes);

        Map<String, String> expected = new HashMap<>(codes);
        System.out.println(codes==expected);
        System.out.println(codes.equals(expected));

        codes.put("404", "Not Found");
        System.out.println(codes);

        String s = codes.get("200");
        System.out.println(s);

        s = codes.get("201");
        System.out.println(s);

        codes.put("304", "Not Modified");
        System.out.println(codes);

        codes.remove("304");
        System.out.println(codes);

        codes.replace("404", "Not Found", "Nono");
        System.out.println(codes);

        System.out.println(codes.containsValue("OK"));
        System.out.println(codes.keySet());
        System.out.println(codes.values());

        System.out.println("entryset: " + codes.entrySet());

        for (Map.Entry entry: codes.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        codes.clear();
        System.out.println(codes.size());

        List<Trainer> trainers = new ArrayList<>(List.of(
                new Trainer(1, "John"),
                new Trainer(2, "Jack"),
                new Trainer(3, "Jane"),
                new Trainer(4, "John")
        ));

        Map<Integer, Trainer> m = new HashMap<>();
        for(Trainer trainer:trainers){
            m.put(trainer.getId(), trainer);
        }

        System.out.println(m.get(3));

        Map<Integer, String> t= new HashMap<>();
        for(Trainer trainer:trainers){
            t.put(trainer.getId(), trainer.getName());
        }
        System.out.println(t);
    }
}
