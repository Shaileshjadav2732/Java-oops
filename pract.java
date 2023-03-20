package oops;

abstract class pen{
abstract void write(String n);
abstract void refile();}

class fountainpen extends pen{
    public void write(String n){
        System.out.println("Thank You"+n);
    }
    public void refile(){
        System.out.println("refile");
    }
    void changePoint(){
        System.out.println("Point changing...!!!");
    }
}
class monkey{
    void jump(){
        int n=20;
        System.out.println("monkey jump "+n+" feet");
    }
    void bite(){
        System.out.println("monket Bite");
    }
}
interface basicaAnimal{
    void eat();
    void sleep();
}
class Human extends monkey implements basicaAnimal{
    void speak(){
        System.out.println("Ram Ram");
    }

    @Override
    public void eat() {
        System.out.println(" Human etting");
    }

    @Override
    public void sleep() {
        System.out.println("Human slipping");
    }
}
public class pract{
    public static void main(String[] args) {
        fountainpen f=new fountainpen();
        f.write(" Shailesh");
 Human me=new Human();
 me.eat();
 me.jump();
 me.sleep();
 me.speak();

 monkey you=new Human();//monkey only jump and bite (Polymorphism)
 you.jump();
 you.bite();

    }
}
