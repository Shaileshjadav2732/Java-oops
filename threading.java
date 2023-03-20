package oops;

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Cooking");
            System.out.println("I am happy...............!");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("chatting");
            System.out.println("I am sad!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            i++;
        }
    }
}

public class threading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread2 t3 = new MyThread2();
        MyThread2 t4 = new MyThread2();
        MyThread2 t5 = new MyThread2();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t5.setPriority(Thread.MIN_PRIORITY);
        t2.start();

    }
}

