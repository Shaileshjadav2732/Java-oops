package oops;
class myrunnableThread implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("thread 11111111111111111111");
        }
    }
}
class myrunnableThread2 implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("thread 222222222222222");
        }
    }
}
public class runnable {
    public static void main(String[] args) {
myrunnableThread th=new myrunnableThread();
 Thread t1=new Thread(th);
        myrunnableThread2 the=new myrunnableThread2();
        Thread t2=new Thread(the);
        t1.start();
        t2.start();
    }
}
