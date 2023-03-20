package oops;
class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while(true){
//            System.out.println("I am a thread");
            System.out.println("Hello");
            try {
                Thread.sleep(2735);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread{

    public void run(){
        while(true){
//            System.out.println("I am a thread");
            System.out.println("World");
        }
    }
}

public class Thread_method{
    public static void main(String[] args){
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

        t2.start();

    }
}
