package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(100.33, true);

        System.out.println(distance.getDistanceInKm() + " exact: " + distance.isExact());

        /*int integerPart = (int) distance.getDistanceInKm();

        System.out.println(integerPart);*/

    }
}
