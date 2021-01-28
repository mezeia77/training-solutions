package ioprintwriter.talentshow;

public class Production {

    private String id;
    private String name;
    private int result;

    public Production(String id, String name, int result) {
        this.id = id;
        this.name = name;
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getResult() {
        return result;
    }
}
