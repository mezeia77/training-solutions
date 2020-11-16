package attributes.person;

public class Person {

    private String name;
    private String identificationCard;
    private Address address;

    public void moveTo (Address address){
        this.address = address;
    }

    public String personToString (){
        return getName() + " " + getIdentificationCard();
    }
    public void correctData(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }
    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    public Address getAddress(){
        return address;
    }
}
