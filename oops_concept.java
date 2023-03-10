package oops;
class Employee{
    int num;
    String name;
    int salary;
public void printdetails(){
    System.out.println("My num is "+num);
    System.out.println(("My name is " +name));
}
public int getsalary(){
    return salary;
}
}
public class oops_concept {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee shailesh=new Employee(); //insentiating a new employee object
        Employee hardik=new Employee();
        shailesh.num=27;
        shailesh.name="jadav";
        shailesh.salary=2500;

        hardik.name="hardik manvana";
        hardik.num=39;
        hardik.salary=2410;

        int salary=shailesh.getsalary();
        System.out.println(salary);

       // System.out.println(shailesh.num);
//   System.out.println(shailesh.name);
        shailesh.printdetails();
        hardik.printdetails();

        shailesh.getsalary();
        hardik.getsalary();
    }
}
