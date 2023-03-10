package oops;
class Employee1{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
    public void callfriend(){
        System.out.println("Call Me...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void ring(){
        System.out.println("ringing....");
    }
    }
    class square {
        int side;

        public int area() {
            return side * side;
        }

        public int perimeter() {
            return 4 * side;
        }
    }
    class tommy{
        public void hit(){
            System.out.println("Hitting the enemy");
        }
        public void run(){
            System.out.println("Running from the enemy");

        }
        public void fire(){
            System.out.println("Fire on enemy");
        }

}
public class Employee_class {
    public static void main(String[] args) {
        Employee1 shailesh=new Employee1();
        square s=new square();
        tommy tom = new tommy();


        shailesh.name="shailesh jadav";
        shailesh.setname("SK  Jadav");
        shailesh.salary=200000;
        System.out.println(shailesh.getname());
        System.out.println(shailesh.salary);

        shailesh.callfriend();
        shailesh.vibrate();
        shailesh.ring();
        s.side=15;
        System.out.println("The area is "+s.area());
        System.out.println( "The perimeter is "+s.perimeter());
        tom.hit();
        tom.run();
        tom.fire();


    }
}
