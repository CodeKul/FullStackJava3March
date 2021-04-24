package multithreading;

public class MultiThreadingDemo {

    public static void main(String[] args) {
        Hii hii = new Hii();
        Thread t1 = new Thread(hii);
        t1.start();
        Hello hello = new Hello();
        hello.start();



    }
}
class Hii implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Hii");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello extends Thread{

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
                System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

