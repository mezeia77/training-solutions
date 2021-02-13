package collectionsmap;

public class Trainer {

    private String name;
    private int id;

    public Trainer(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
