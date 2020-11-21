package attributes.person;

public class PersonMain {
    public static void main(String[] args) {

        Address address = new Address("Hu", "Bp", "Kiskutya 10", "1111");
        Person person = new Person("Kovács Béla", "007");

        person.moveTo(address);
        person.correctData("XY", "mz/x");
        System.out.println(address.adressToString());
        System.out.println(person.personToString());

    }



}
