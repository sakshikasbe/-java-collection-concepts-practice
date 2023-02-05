

import java.util.*;
import java.util.stream.Collectors;

class Employee implements Comparable<Employee>{
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

    @Override
    public int compareTo(Employee o) {
        return this.salary - o.salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Vikram", 14000,10));
        list.add(new Employee("Vikas",20000,20));
        list.add(new Employee("Vivek",16000,5));

        //List<String> or List<Integer>
        //To use Collections.sort(list of employees),  we must implement Comparable interface
        // and provide definition for compareTo method and comparison parameters.
        Collections.sort(list);
        System.out.println(list);

        list.stream().sorted(Comparator.comparing(Employee::getSalary)).toList().forEach(System.out::println);
    }
}