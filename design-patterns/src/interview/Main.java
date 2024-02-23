package interview;

import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        new Main().main();
    }
    public void main() {


        TreeMap<Employee, String> treeMap = new TreeMap<>(Comparator.comparing(Employee::getName));

        Employee emp1 = new Employee("John", 101);
        Employee emp2 = new Employee("Alice", 102);
        Employee emp3 = new Employee("Bob", 103);
        Employee emp4 = new Employee("Mob", 107);

        treeMap.put(emp1, "Department A");
        treeMap.put(emp2, "Department B");
        treeMap.put(emp3, "Department C");
        treeMap.put(emp4, "Department C");

        // TreeMap will now be sorted based on the names of the employees
        System.out.println(treeMap);

    }

    class Employee{
        private String name;
        private int id;

        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}
