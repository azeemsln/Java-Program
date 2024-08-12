
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Mythread extends Thread {
    private String threadname;

    public Mythread(String name) {
        this.threadname = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread interrupted ");
        }
        Thread.yield();
    }
}

public class thread {
    public static void main(String[] args) {
        Mythread thread1 = new Mythread("thread1");
        Mythread thread2 = new Mythread("thread2");
        try {
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
        } catch (Exception e) {
            System.out.println("Main thread Existing ");
        }

    }
}
