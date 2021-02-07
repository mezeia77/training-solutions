package week02;

import java.util.Scanner;

public class Controller {
    Office office = new Office();

    public void readOffice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n"+"Add meeting room");
        System.out.println("Number of meeting rooms? ");
        int number = scanner.nextInt();
        scanner.nextLine();
        String name = "";
        int i = 0;
        do {
            System.out.println("Name: ");
            name = scanner.nextLine();
            System.out.println("Length: ");
            int length = scanner.nextInt();
            System.out.println("Width: ");
            int width = scanner.nextInt();
            scanner.nextLine();
            office.addMeetingRoom(new MeetingRoom(name, length, width));
            i++;
        } while (i<number);
        office.printAreas();
    }

    public void printMenu(){
        System.out.println("Add meeting room: 1");
        System.out.println("Print names: 2");
        System.out.println("Print names reverse: 3");
        System.out.println("Print even names: 4");
        System.out.println("Print areas: 5");
        System.out.println("Print meeting room with names: 6");
        System.out.println("Print meeting room contains: 7");
        System.out.println("Print meeting room larger than: 8");
        System.out.println("Exit: 0");

    }

    public void runMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n"+"Please choose a number: ");
        int number = scanner.nextInt();

        switch (number){
            case 1:readOffice();break;
            case 2:office.printNames();break;
            case 3:office.printNamesReverse();break;
            case 4:office.printEvenNames();break;
            case 5:office.printAreas();break;
            case 6:
                System.out.println("Name? ");
                scanner.nextLine();
                String s = scanner.nextLine();
                office.printMeetingRoomsWithName(s);break;
            case 7:
                System.out.println("Name? ");
                scanner.nextLine();
                String t = scanner.nextLine();
                office.printMeetingRoomsContains(t);break;
            case 8:
                System.out.println("Area? ");
                int i = scanner.nextInt();
                office.printAreasLarger(i);break;
            case 9:break;
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.printMenu();
        controller.runMenu();
    }

}
