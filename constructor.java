package oops;
class mymainemployee {
    private int id;
    private  String name;
    private int salary;
    public mymainemployee(int mid ,String mname ,int msalary){
        id=mid;
        name=mname;
        salary=msalary;
    }
    public mymainemployee(int myid){
        id=myid;
    }
    public void setid(int id){
        id=id;
    }
    public int getid(){
        return id;
    }
    public void setname(String name){
        name= name;
    }
    public String getname(){
        return name;
}
    public void setsalary(int salary){
        salary=salary;
    }
    public int getsalary(){
    return salary;
    }
}
public class constructor {
    public static void main(String[] args) {
        mymainemployee emp=new mymainemployee(2627,"shailesh", 100000);
        mymainemployee em=new mymainemployee(27);
        System.out.println(emp.getid());
        System.out.println(emp.getname());
        System.out.println(emp.getsalary());
        System.out.println(em.getid());
    }
}
