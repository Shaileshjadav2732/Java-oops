package oops;

class mythr extends Thread {
    public mythr(String name) {
        super(name);
    }
    public void run() {
        int i=2305;
        System.out.println("thanks..........!!!!!");
       // while (true) {
           // System.out.println("THis is thread 2");
        //}
    }
}

public class thread_con {
    public static void main(String[] args) {
        mythr th = new mythr("shailesh");
        mythr the = new mythr("jadav");
        //th.getId();
        th.start();
        th.start();
        System.out.println("The id of the thread th is " + th.getId());
        System.out.println("The name of the thread th is " + th.getName());
        System.out.println("The id of the thread the is " + the.getId());
        System.out.println("The name of the thread the is " + the.getName());

    }
}





