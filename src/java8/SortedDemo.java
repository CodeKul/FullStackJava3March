package java8;

import java.util.*;

public class SortedDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,33,4,55,6,5);

        list.stream().sorted().forEach(System.out::println);//Ascending
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);//descending

        Employee obj1 = new Employee(1,"Tina",10000.00);
        Employee obj2 = new Employee(2,"Ravi",20000.00);
        Employee obj3 = new Employee(3,"Suhas",12200.88);

        List<Employee>list1 = Arrays.asList(obj1,obj2,obj3);

        list1.stream()
                .sorted(
                        Comparator.comparingDouble(Employee::getSalary)
                                .reversed())
                .forEach(System.out::println);
    }
}


class Employee{

    int id;
    String name;
    Double salary;

    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}