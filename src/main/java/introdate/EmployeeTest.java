package introdate;

public class EmployeeTest {
    public static void main(String[] args) {

Employee employee = new Employee(1980,02, 21, "Kiss Pista");

        System.out.println("Név: " + employee.getName());
        System.out.println("Született: " + employee.getDateOfBirth());
        System.out.println("Belépett: " + employee.getBeginEmployment());

    }
}
