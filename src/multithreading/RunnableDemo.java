package multithreading;

public class RunnableDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(()-> {
                for(int i=1;i<=5;i++){
                    System.out.println("Hii");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        });

        Thread t2 = new Thread(() ->{
                for(int i=1;i<=5;i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exit");
    }
}

//new - >Whenever you create a thread object
//runnable -> Whenever you invoke the start method thread is not selected as running thread
//Running -> Thread scheduler selected as running thread
//Blocked -> sleep,wait,lock
//Terminated -> run method exit
