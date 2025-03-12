package MapDemo;
import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String name;
    int salary;
    int id;
    Employee(String name, int salary, int id){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
}
public class Demo3_Filter_Map {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("John Doe", 500, 1));
        employees.add(new Employee("Mne We", 6000, 2));
        employees.add(new Employee("Shee QWoe", 15000, 3));
        employees.add(new Employee("Shee QWoe", 25000, 3));
        employees.add(new Employee("Shee QWoe", 43000, 3));

        employees.stream().filter(employee -> employee.salary > 6000).
                map(employee->employee.salary)
                .forEach(System.out::println);
    }
}
