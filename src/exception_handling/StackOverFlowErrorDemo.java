package exception_handling;

public class StackOverFlowErrorDemo {

    private void recursion(int i){
        System.out.println("i=>"+i);
        if(i==0){
            return;
        }else {
            recursion(i);
        }
    }


    public static void main(String[] args) {
        StackOverFlowErrorDemo obj = new StackOverFlowErrorDemo();
        obj.recursion(1);
    }
}
