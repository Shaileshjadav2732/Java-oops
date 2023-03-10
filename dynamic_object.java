package oops;

class phone{
    int number;
    public void phone(int x,int y){
        System.out.println("I am phone");
    }
    public void phone2(){
        System.out.println("I am the phone2");
    }
}
class iqoo_z5 extends phone{
    public void phone2(){
        System.out.println("i am phone2 of IQOO Z5 class");
    }
    public void iqoo_z5(int x,int y){
        System.out.println("I am free from all of this phone");
    }
}
public class dynamic_object {
    public static void main(String[] args) {
      /*  phone p= new phone();
        iqoo_z5 p1=new iqoo_z5();
        p.phone2();
        p.phone(45,56);
        p1.iqoo_z5(54,65);
       // p.iqoo_z5();//this is not allowed
       */
        phone p=new iqoo_z5();
        p.phone2();
        p.phone(0b101101, 0b1000101);
    }
}
