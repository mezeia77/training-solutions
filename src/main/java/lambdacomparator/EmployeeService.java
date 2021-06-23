package lambdacomparator;

import java.util.Comparator;
import java.util.List;

public class EmployeeService {

    private List<Employee> employees;


    public List<Employee> sortByName(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getName));
        return employees;
    }

    public List<Employee> sortBySalaryThanName(List<Employee> employees){
        employees.sort(Comparator.comparingInt(Employee::getSalary).thenComparing(Employee::getName));
        return employees;
    }


    public List<Employee> sortByCardNumberNullsFirst(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getCardNumber, Comparator.nullsFirst(Comparator.naturalOrder())).thenComparing(Employee::getName));
        return employees;
    }

    public List<Employee> sortByNameReversed(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getName).reversed());
        return employees;
    }
}
