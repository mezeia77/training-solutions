package introconstructor;

public class TaskMain {

    public static void main(String[] args) {

        Task task = new Task("Learn Java","Spend more time on practise");

        System.out.println("Title: " + task.getTitle() + "\n" + "Description: " + task.getDescription());

        task.start();
        System.out.println("Starts: " + task.getStartDateTime());

        task.setDuration(100);
        System.out.println("Duration: " + task.getDuration() + " hours");

    }
}
