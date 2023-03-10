package oops;
class circle1 {
    public int radius;

    circle1(){
        System.out.println("this is a circle");
    }
    circle1(int r) {
        this.radius = r;

    }

    public double area() {
        return Math.PI * radius * radius;

    }
}
class cylinder1 extends circle1{
    public int hight;

    cylinder1() {
        System.out.println("this is a CYLINDER");
    }
    cylinder1(int h,int r) {
        super(r);
        System.out.println("I'm cylinder1 constructor");
        this.hight = hight;
    }

    public double volume(int r, int h) {

        return Math.PI * r * r * h;
    }
}


public class circle{
    public static void main(String[] args) {
        circle1 c = new cylinder1(54,87);
//        circle1 cr=new circle1();

    }

}
