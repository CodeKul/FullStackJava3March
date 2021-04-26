package multithreading;

public class SynchronizationDemo {

    int num;

    public static void main(String[] args) throws InterruptedException {
        SynchronizationDemo demo = new SynchronizationDemo();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    demo.count();
                }
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    demo.count();
                }
            }
        });


        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(demo.num);

    }

    public void count() {
        num++;
    }

}
