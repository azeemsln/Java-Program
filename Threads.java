class Car implements Runnable {
    synchronized public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " Has in the parking");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Ready to start");
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName() + " is driving by driver.");
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName() + " Parked in the parking");
        }
         catch (Exception e) {
            System.out.println("Some problem occcure.");
        }
    }
}

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        Car c = new Car();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t1.setName("fortuner");
        t2.setName("Scorpio");
        t3.setName("BMW");
        t1.start();
        // t1.join();

        t2.start();
        // t1.join();

        t3.start();
        // t1.join();

    }
}
