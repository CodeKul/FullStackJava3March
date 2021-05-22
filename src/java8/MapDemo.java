package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Stream map => return a stream consisting of the result of applying give function to the element
 *
 * map takes function as argument and Function takes two argument
 * first argument -> type of data
 * second argument -> type of return value
 */
public class MapDemo {

    public static void main(String[] args) {
        Student obj1 = new Student(1,"Ravi",89);
        Student obj2 = new Student(2,"Prakash",57);
        Student obj3 = new Student(3,"Akash",34);

        List<Student> list = Arrays.asList(obj1,obj2,obj3);

        list.stream()
                .filter(f->f.marks==34)
                .map(m->m.marks+1)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list1.stream().map(m->m+2).forEach(System.out::println);

        Function<String,String> function = f->f.toUpperCase();
        List<String> list2 = Arrays.asList("java","is","programming","language");
        list2.stream().map(function).forEach(System.out::println);

    }
}

class Student {

    Integer id;
    String name;
    Integer marks;

    public Student(Integer id, String name, Integer marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}