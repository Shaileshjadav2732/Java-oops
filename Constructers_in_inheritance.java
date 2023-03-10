package oops;

class base1{
    base1(){
        System.out.println("I am a Constructer");
    }
  base1(int x){
      System.out.format("I am a Constructer of value %d\n",x);
  }
}
 class derrived1 extends base1 {
     derrived1() {
         System.out.println("I am derrived class constructer");
     }
     derrived1(int x ,int y){
         super(x);
         System.out.format("I am derrived class constructer with value %d\n",y);
     }
 }
 class childofderrived extends derrived1{
    childofderrived(){
    System.out.format("I am childofderrived constructer\n");
    }
    childofderrived(int x,int y, int z){
        super(x,y);
        System.out.format("I am childofderrived constructer with value %d\n",z);
    }
 }

     public class Constructers_in_inheritance {
         public static void main(String[] args) {
             base1 b = new base1();
             derrived1 d = new derrived1();
             childofderrived cd=new childofderrived();

             base1 b1 = new base1(27);
             derrived1 d1 = new derrived1(32,56);
             childofderrived cd1=new childofderrived(98,26,23);
         }
     }
