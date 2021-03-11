package inheritance;

public class Teacher { //Parent class , Super class , Base class

    int id;
    String name;
    String address;
}

class PhysicsTeacher extends Teacher{//child class , sub class ,derived class

    public static void main(String[] args) {

        PhysicsTeacher teacher = new PhysicsTeacher();
        teacher.id = 1;
        teacher.name= "abc";
        teacher.address = "Pune";
    }
}

class ChemistryTeacher extends PhysicsTeacher{
    public static void main(String[] args) {

        ChemistryTeacher teacher = new ChemistryTeacher();
        teacher.id = 2;
        teacher.name= "abcef";
        teacher.address = "Nashik";
    }
}