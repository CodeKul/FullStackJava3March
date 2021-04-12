package collection;

public class GenericClassDemo<T> {

    private T t;

    private void add(T t){
        this.t = t;
    }

    private T get(){
        return t;
    }

    public static void main(String[] args) {

        GenericClassDemo<Integer> obj = new GenericClassDemo<>();
        obj.add(14);
        System.out.println(obj.get());

        GenericClassDemo<String> obj1 = new GenericClassDemo<>();
        obj1.add("Java");
        System.out.println(obj1.get());
    }

}
