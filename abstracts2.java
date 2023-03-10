package oops;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle...");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

public class abstracts2 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();
    }
}

