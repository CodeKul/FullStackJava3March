package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class EmployeeSet {

    int id;
    String name;

    public EmployeeSet(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeSet that = (EmployeeSet) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        System.out.println(Objects.hash(id, name));
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        EmployeeSet obj1 = new EmployeeSet(1, "Sachin");
        EmployeeSet obj2 = new EmployeeSet(1, "Sachin");
        EmployeeSet obj3 = new EmployeeSet(3, "Ravi");

        Set<EmployeeSet> set = new HashSet<>();
        set.add(obj1);
        set.add(obj2);
        set.add(obj3);

        set.forEach(s->{
            System.out.println(s.id+ " "+s.name);
        });
    }
}
