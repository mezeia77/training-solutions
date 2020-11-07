package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {

        IntroControl introControl = new IntroControl(22);

        System.out.println(introControl.substractTenIfGreaterThanTen());
        System.out.println(introControl.describeNumber());
        System.out.println(introControl.greetingToJoe());
        System.out.println(introControl.calculateBonus(2000000));
        System.out.println(introControl.calculateConsumption(100, 1000));
        introControl.printNumbers(3);
        introControl.printNumbersBetween(5, 10);
        introControl.printNumbersBetweenAnyDirection(15, 3);
        introControl.printOddNumbers(60);

    }
}
