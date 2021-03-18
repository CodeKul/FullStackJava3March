package exception_handling;

public class ThrowKeyWord {

    public static void main(String[] args) throws Exception{

        int i=17;

        if(i>=18){
            System.out.println("You can vote");
        }else {
//            try {
                throw new Exception("You can not vote");
//            }catch (Exception e){
//                System.out.println(e);
//            }
        }

    }
}
