package oops;
class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getsurfaceArea(){
        return  2 * Math.PI *radius*(height+radius);
    }
    public double volume(){
        return Math.PI *radius*radius*height;
    }
}
class rectanle{
    private int length;
    private int breadth;

    public rectanle() {
        this.length = 27;
        this.breadth = 26;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class cylinder_problem {
    public static void main(String[] args) {
        cylinder mycylinder= new cylinder(96,85);
        rectanle myrectangle=new rectanle();
        mycylinder.setHeight(56);
         int h =mycylinder.getHeight();
        System.out.println(h);
        mycylinder.setRadius(27);
        System.out.println(mycylinder.getRadius());

        System.out.println(mycylinder.getsurfaceArea());
        System.out.println(mycylinder.volume());

        System.out.println(myrectangle.getLength());
        System.out.println(myrectangle.getBreadth());

    }
}
