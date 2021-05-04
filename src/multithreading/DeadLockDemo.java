package multithreading;

public class DeadLockDemo {


    /**
     * Deadlock => it can occur in situation when a thread is waiting for object lock that is acquired by another thread
     * and second thread is waiting for an object lock that is acquired by first Thread.
     * Since, both thread are waiting for each other to release the objet lock, this is called deadlock.
     */
    public static void main(String[] args) {

        String resource1 = "printer";
        String resource2 = "Scanner";

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " Locked" + resource1);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " Locked" + resource2);
                }
            }
        });

        Thread t2 = new Thread(() -> {

            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " Locked" + resource2);
            }
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " Locked" + resource1);
            }
        });

        t1.setName("Computer");
        t2.setName("Laptop");
        t1.start();
        t2.start();

    }
}
