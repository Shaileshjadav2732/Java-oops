package oops;

import java.util.Scanner;

public class Error_And_Exception {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 26;
        marks[1] = 27;
        marks[2] = 28;
        marks[3] = 29;
        marks[4] = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index");
        int a = sc.nextInt();

        System.out.println("Enter the number you want to devide value with");
        int number = sc.nextInt();
        try {
            System.out.println("The value of (array/number)  is entered is" + marks[a] / number);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException ic occured");
            System.out.println(e);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException is occured");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("some other Exception is occured occured");
            System.out.println(e);
        }
    }
}