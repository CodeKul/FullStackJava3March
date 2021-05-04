package multithreading;
//Interrupt => if thread is in sleeping or waiting state then using interrupt() method
// we can interrupt the execution of thread
//if you don't use sleep or wait then flow works normally
public class InteruptDemo extends Thread {

    public static void main(String[] args) {
        InteruptDemo demo = new InteruptDemo();
        demo.start();
        demo.interrupt();
        System.out.println(demo.isInterrupted());
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("i=>" + i);
                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted e=>" + e);
        }
    }
}
