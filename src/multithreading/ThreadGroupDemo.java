package multithreading;

public class ThreadGroupDemo implements Runnable {


    public static void main(String[] args) {

        ThreadGroupDemo obj1 = new ThreadGroupDemo();
        ThreadGroupDemo obj2 = new ThreadGroupDemo();
        ThreadGroupDemo obj3 = new ThreadGroupDemo();

        ThreadGroup threadGroup = new ThreadGroup("ThreadGroup");

        Thread t1 = new Thread(threadGroup, obj1, "t1");
        Thread t2 = new Thread(threadGroup, obj2, "t2");
        Thread t3 = new Thread(threadGroup, obj3, "t3");

        t1.start();
        t2.start();
        t3.start();
//        System.out.println(threadGroup.isDaemon());
//        System.out.println(threadGroup.getName());
//        System.out.println(threadGroup.activeCount());
        threadGroup.list();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
