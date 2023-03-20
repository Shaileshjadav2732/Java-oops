package oops;

class Thread_p extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello Good morning");
        }
    }
}

class Thread_p2 extends Thread {
    public void run() {
        try {
            Thread.sleep(270);
        } catch (Exception e) {
            System.out.println(e);
        }
        while (true) {
            System.out.println("good Afternon");
        }
    }
}

public class thread_practice {
    public static void main(String[] args) {
        Thread_p pr = new Thread_p();
        Thread_p2 pr2 = new Thread_p2();
        pr.start();
        pr2.start();
    }
}
