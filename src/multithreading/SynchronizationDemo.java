package multithreading;

public class SynchronizationDemo {

    static int num;

    public static synchronized void count() {
        num++;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizationDemo demo = new SynchronizationDemo();
        SynchronizationDemo demo1 = new SynchronizationDemo();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    SynchronizationDemo.count();
                }
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    SynchronizationDemo.count();
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    SynchronizationDemo.count();
                }
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    SynchronizationDemo.count();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println(num);
    }


    //resource
//    public synchronized void count() {
//        num++;
    //Multiple statment  100

//    }


    //synchronized block
//    public void count(){
//        synchronized (this){
//            num++;
//        }
//    }

}
