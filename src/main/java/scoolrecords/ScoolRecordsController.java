package scoolrecords;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ScoolRecordsController {

    private ClassRecords classRecords;
    private Tutor tutor = new Tutor("Nagy Csilla",
            Arrays.asList(new Subject("földrajz"),
                    new Subject("matematika"),
                    new Subject("biológia"),
                    new Subject("zene"),
                    new Subject("fizika"),
                    new Subject("kémia")));

    public void initScool(){
        classRecords = new ClassRecords("Fourth Grade A", new Random(5));
        Student firstStudent = new Student("Kovács Rita");
        Student secondStudent = new Student("Nagy Béla");
        Student thirdStudent = new Student("Varga Márton");
        firstStudent.grading(new Mark(MarkType.A, new Subject("földrajz"), tutor));
        firstStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        firstStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        secondStudent.grading(new Mark(MarkType.A, new Subject("biológia"), tutor));
        secondStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        secondStudent.grading(new Mark(MarkType.D, new Subject("zene"), tutor));
        thirdStudent.grading(new Mark(MarkType.A, new Subject("fizika"), tutor));
        thirdStudent.grading(new Mark(MarkType.C, new Subject("kémia"), tutor));
        thirdStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        classRecords.addStudent(firstStudent);
        classRecords.addStudent(secondStudent);
        classRecords.addStudent(thirdStudent);
    }

    public void printOut(){
        System.out.println("1. Diákok nevének listázása\n" +
                "2. Diák név alapján keresése\n" +
                "3. Diák létrehozása\n" +
                "4. Diák név alapján törlése\n" +
                "5. Diák feleltetése\n" +
                "6. Osztályátlag kiszámolása\n" +
                "7. Tantárgyi átlag kiszámolása\n" +
                "8. Diákok átlagának megjelenítése\n" +
                "9. Diák átlagának kiírása\n" +
                "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
                "11. Kilépés");
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        Integer i = 0;
        do{
            printOut();
            i=scanner.nextInt();
            scanner.nextLine();
            if(i<1 || i>11){
                i=0;
            }
            String s="";
            String t = "";
            switch (i){
                case 1:
                    System.out.println(classRecords.listStudentNames()+"\n");
                    break;
                case 2:
                    System.out.println("Kérem a nevet");
                    s=scanner.nextLine();
                    System.out.println(classRecords.findStudentByName(s)+"\n"); break;
                case 3:
                    System.out.println("Kérem a nevet");
                    s=scanner.nextLine();
                    classRecords.addStudent(new Student(s));break;
                case 4:
                    System.out.println("Kérem a nevet");
                    s=scanner.nextLine();
                    classRecords.removeStudent(new Student(s));break;
                case 5:
                    System.out.println(classRecords.repetition());break;
                case 6:
                    System.out.println(classRecords.calculateClassAverage()+"\n"); break;
                case 7:
                    System.out.println("Kérem a tantárgyat");
                    s=scanner.nextLine();
                    System.out.println(classRecords.calculateClassAverageBySubject(new Subject(s))+"\n");break;
                case 8:
                    System.out.println(classRecords.listStudyResults());break;
                case 9:
                    System.out.println("Kérem a nevet");
                    s=scanner.nextLine();
                    System.out.println(classRecords.findStudentByName(s).calculateAverage()+"\n");break;
                case 10:
                    System.out.println("Kérem a nevet");
                    s=scanner.nextLine();
                    System.out.println("Kérem a tantárgyat");
                    t=scanner.nextLine();
                    System.out.println(classRecords.findStudentByName(s).calculateSubjectAverage(new Subject(t))+"\n");break;
            }
        } while (i!=11);
    }

    public static void main(String[] args) {
        ScoolRecordsController scoolRecordsController = new ScoolRecordsController();
        scoolRecordsController.initScool();
        scoolRecordsController.menu();
    }
}
