package oops;
class base{
 public int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        System.out.format("I am setting %d now\n",number);
        this.number = number;
    }
}
class derrived extends base{
    public int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        System.out.format("I am setting %d now\n",num);
        this.num = num;
    }
}

public class inheritance {
    public static void main(String[] args) {
      base b=new base();

    // You can also use derrived class

      derrived d=new derrived();
      b.setNumber(5555);
        System.out.println(b.getNumber());
        d.setNumber(4444);
        System.out.println(d.getNumber());
        //b.setNum(45); //you can not use
        d.setNum(45);
        System.out.println(d.getNum());
    }

}
