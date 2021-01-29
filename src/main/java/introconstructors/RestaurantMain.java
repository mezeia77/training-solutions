package introconstructors;

public class RestaurantMain {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Pingvin", 20);

        System.out.println("Name: " + restaurant.name + "\n" + "Capacity: " + restaurant.capacity);
        System.out.println(restaurant.getMenu());

    }
}
