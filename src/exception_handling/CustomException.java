package exception_handling;

public class CustomException {

    public static void main(String[] args) {

       validate();
    }

    public static void validate(){
        int i=17;

        if(i>=18){
            System.out.println("You can vote");
        }else {
            try {
                throw new MyException("You can not vote");

            }catch (Exception e){
                System.out.println(e);
            }
        }

    }
}

class MyException extends Exception{

    MyException(String msg){
        super(msg);
    }
}
