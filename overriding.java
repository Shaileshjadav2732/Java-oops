package oops;
class me{
    public int number;
    public void me(){
        System.out.println("I am me At primary class");
    }
}
class my extends me{
    @Override
    public  void me(){
        System.out.println("Ia am me At my class");
    }
    public void other(){
        System.out.println("I am nothing");
    }
}

public class overriding {
    public static void main(String[] args) {
        me m =new me();
        m.me();

        my m1=new my();
        m1.me();

    }
}
