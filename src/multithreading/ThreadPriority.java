package multithreading;

public class ThreadPriority {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        Thread2 t2 = new Thread2();
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
    }
}

class Thread1 extends Thread{

    @Override
    public void run() {
        System.out.println("In Thread 1 Method");
    }
}

class Thread2 extends Thread{

    @Override
    public void run() {
        System.out.println("In Thread 2 Method");
    }
}
//min priority - > 1
//Max priority -> 10
//normal priority -> 5