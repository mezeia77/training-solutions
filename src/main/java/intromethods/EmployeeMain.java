package intromethods;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee = new Employee("Buga Jakab", 1996, 3_500_000);

        System.out.println("Név: " + employee.getName() + "\n" + "Belépett: " + employee.getHiringYear() + "\n" + "Fizetés: " + employee.getSalary());
        //System.out.println("Név: " + employee.name + "\n" + "Belépett: " + employee.hiringYear + "\n" + "Fizetés: " + employee.salary);

        employee.raiseSalary(5);

        System.out.println(employee.getName() + " új havi fizetése: " + employee.getSalary());

    }
}
