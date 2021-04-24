package multithreading;

public class DaemonThreadDemo extends Thread{

    @Override
    public void run() {
        System.out.println("In Run method");
//        System.out.println(Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        Thread.currentThread().setDaemon(true);

        DaemonThreadDemo demo = new DaemonThreadDemo();
        demo.setDaemon(true);
        demo.start();
    }
}

//def > Daemon thread is which run in background of another thread
//use -> It provides service to other thread
//eg -> finalize ,garbage collector ->
//method -> isDaemon(),setDaemon()

//case-> 1. Whenever you create daemon thread you have to set before starting thread
//         2. You can not set daemon as main Thread
