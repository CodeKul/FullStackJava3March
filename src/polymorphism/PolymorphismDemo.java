package polymorphism;

public class PolymorphismDemo {

    public static void main(String[] args) {

        PolymorphismDemo polymorphismDemo = new PolymorphismDemo();
        polymorphismDemo.add(1, 3);
        polymorphismDemo.add(2, 3);
    }

    public void add(int i, int j) {//local variable

        System.out.println(i + j);
    }

    public void add(int i, float j) {
        System.out.println(i + j);
    }
}


class Addition extends PolymorphismDemo {

    public static void main(String[] args) {

        Addition addition = new Addition();
        addition.add(9, 9);

    }

    public void add(int i, float j) {
        System.out.println(i + j);
    }

}