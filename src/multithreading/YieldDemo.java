package multithreading;

public class YieldDemo extends Thread {

//Yield -> Yield method is static and native(implementation do by another programming language)
//use -> It can stop execution of current thread and give chance to other thread of same priority or higher priority
    @Override
    public void run() {
        for (int i=1;i<5;i++){
            Thread.yield();
            System.out.println("In run Method=>"+i);
        }
        System.out.println("Thread Died"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Main Thread");

        YieldDemo yieldDemo = new YieldDemo();
        yieldDemo.start();

        for(int i=1;i<5;i++){
            System.out.println("In Main Thread->"+i);
        }

    }
}
