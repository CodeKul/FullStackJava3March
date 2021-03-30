package collection;


import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

        //Arraylist uses dynamic array to store element
        //Arraylist maintain insertion order
        //Arraylist store duplicate element

        ArrayList<Integer> list = new ArrayList<>();//default is size 10

        list.add(10);
        list.add(10);
        list.add(30);
        list.add(40);

        Collections.sort(list);
//        Iterator<Integer> iterator = list.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        ListIterator<Integer> listIterator = list.listIterator(2);
//
//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }

        Iterator<Integer> iterator;

        for(iterator= list.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

        list.forEach(s->{
            System.out.println(s);
        });


        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(10);
        list1.add(10);

        List<Integer> list2 = Arrays.asList(1,2,34,45,5);

        List<Integer> list3 = new ArrayList<>(List.of(1,2,34,5));

        List<Integer> list4 = new ArrayList<>(){
            {
                add(1);
                add(2);
                add(2);
                add(3);
            }
        };

    }
}
