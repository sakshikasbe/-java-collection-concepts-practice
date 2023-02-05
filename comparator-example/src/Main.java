

import java.util.*;

class Employee {
    String name;
    int salary;
    int id;

    public Employee(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return salary == employee.salary && id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }


}
class EmployeeComparatorBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary - o2.salary;
    }
}

class EmployeeComparatorById implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id - o2.id;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Vikram", 14000,10));
        employeeList.add(new Employee("Vikas",20000,20));
        employeeList.add(new Employee("Vivek",16000,5));

        /*
        The lambda expression (o1, o2) -> o1.salary- o2.salary
        This provides implementation for compare method of functional interface Comparator
        The lambda has no name and doesn't belong to any class.
        This lambda is in the form of (parameter1, parameter2) -> expression
         */
//        Collections.sort(employeeList, (o1, o2) -> o1.salary- o2.salary);

        EmployeeComparatorBySalary employeeComparatorBySalary = new EmployeeComparatorBySalary();
        Collections.sort(employeeList, employeeComparatorBySalary);

//        EmployeeComparatorById employeeComparatorById = new EmployeeComparatorById();
//        Collections.sort(employeeList, employeeComparatorById);

        System.out.println(employeeList);

//        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).toList().forEach(System.out::println);
    }
}