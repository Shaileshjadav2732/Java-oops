package oops;

import java.util.Scanner;

class NegativeRadiusException extends Exception {
    public String tostring() {
        return "radius can not br negative";
    }

    public String getMessage() {
        return "radius cannot be negative";
    }
}

public class Throw_Throws {
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = ( Math.PI * r * r);
        return result;
    }

    public static int devide(int a, int b) throws ArithmeticException {
        int result;
        result = a / b;
        return result;

    }

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            double ar = area(s);
            System.out.println(ar);

            int c = devide(5, s);
            System.out.println(c);

        } catch (Exception e) {
            System.out.println("This in an Exception");

        }
    }
}