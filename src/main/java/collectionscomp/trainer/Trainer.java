package collectionscomp.trainer;

public class Trainer implements Comparable<Trainer>{

    private String name;
    private int salary;

    public Trainer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Trainer o) {
        return name.compareTo(o.name);
//        return salary-o.salary;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
