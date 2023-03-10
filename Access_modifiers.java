package oops;

class Myemployee{
    private int id;
    private String name;

    public String getname(){
        return name;
    }
    public void setname(String n){
        this.name =n;
    }
    public int getid(){
        return id;
    }
    public void setid(int i){
       this.id=i;
    }
}

public class Access_modifiers {
    public static void main(String[] args) {
        Myemployee Employee1=new Myemployee();

        Employee1.setid(27);
        Employee1.setname("shailesh");
        System.out.println(Employee1.getid());
        System.out.println(Employee1.getname());
    }
}
