package oops;
interface sampleinterface{
    void method1();
    void method2();
}
interface childsampleinterface extends sampleinterface{
    void meth3();
    void meth4();
}
class mysampleclass implements childsampleinterface{
    public void method1(){
        System.out.println("method 1 is running");
    }
    public void method2(){
        System.out.println("method 2 is running");
    } public void meth3(){
        System.out.println("method 3 is running");
    } public void meth4(){
        System.out.println("method 4 is running");
    }
}
public class interface_and_inheritance {
    public static void main(String[] args) {
mysampleclass obj=new mysampleclass();
  obj.method1();
  obj.method2();
  obj.meth3();
  obj.meth4();
    }
}
