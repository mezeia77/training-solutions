package week02d03;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public static boolean areTheyEqual(String name, String anotherName){
        return anotherName.equals(name);
    }

    public static void main(String[] args) {
        System.out.println(areTheyEqual("Telefon", "Telefon"));
        System.out.println(areTheyEqual("Telefon", "Teló"));
    }
}
