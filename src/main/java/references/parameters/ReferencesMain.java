package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {

        Person a = new Person("John Doe", 1980);
        Person b = a;

        b.setName("Jack Doe");

        System.out.println("Person a: " + a.getName() + " " + a.getAge());
        System.out.println("Person b: " + b.getName() + " " + a.getAge());

        int x = 24;
        int y = x;

        y++;

        System.out.println("X=" + x);
        System.out.println("Y=" + y);

        b = new Person("Marie Joe", 1990);

        System.out.println(a.getName() + a.getAge());
        System.out.println(b.getName() + b.getAge());


    }
}

