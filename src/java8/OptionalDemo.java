package java8;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(1,"Ravi",null);
//        System.out.println(customer.getEmail());
////        System.out.println(customer.getEmail().toUpperCase());
//
//        if(customer.getEmail() != null){
//            System.out.println(customer.getEmail().toUpperCase());
//        }else {
//            System.out.println("Email is null");
//        }

//        Optional<String> optional = Optional.empty();//return empty object of optional
//
//        System.out.println(optional);

//        Optional<String> optional1 = Optional.of(customer.getEmail());//return exception if your value is null
//        System.out.println(optional1);

//        Optional<String> optional2 = Optional.ofNullable(customer.getEmail());//return value if value is present otherwise retrun empty
//        if(optional2.isPresent()){
//            System.out.println(optional2.get());
//        }
//

        Optional<String> optional4 = Optional.ofNullable(customer.getEmail());
        System.out.println(optional4.orElse("Default email"));

        Optional<String> optional5 = Optional.ofNullable(customer.getEmail());
        System.out.println(optional5.orElseGet(()->"dashdksa"));

        Optional<String> optional6 = Optional.ofNullable(customer.getEmail());
        System.out.println(optional6.orElseThrow(()->new Exception("exc")));


    }
}

class Customer{
    int id;
    String name;
    String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}