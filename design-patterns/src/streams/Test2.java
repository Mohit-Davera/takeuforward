package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Amit", "IT", 75000));
        employees.add(new Employee(2, "Neha", "HR", 55000));
        employees.add(new Employee(3, "Rahul", "Finance", 65000));
        employees.add(new Employee(4, "Priya", "IT", 82000));
        employees.add(new Employee(5, "Vikas", "Sales", 60000));
        employees.add(new Employee(6, "Sneha", "Marketing", 58000));
        employees.add(new Employee(7, "Arjun", "IT", 90000));
        employees.add(new Employee(8, "Kiran", "Finance", 72000));
        employees.add(new Employee(9, "Pooja", "HR", 50000));
        employees.add(new Employee(10, "Rohit", "Sales", 68000));


        Map<String, List<Employee>> deptAndEmp = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
        Map<String,Long> deptAndEmpCount = employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));


    }


}
