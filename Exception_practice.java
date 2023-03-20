package oops;
import java.util.Scanner;

public class Exception_practice {
    public static void main(String[] args) {
        int age = 18;
        // int Year_born=2000-18;  //logical Error
        // System.out.println(47/000);
        try {
            int a = 9 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument exception");
        }

        boolean flag = true;
        int[] marks = new int[4];
        marks[0] = 25;
        marks[1] = 26;
        marks[2] = 27;
        marks[3] = 28;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i <= 6) {
            try {
                index = sc.nextInt();
                System.out.println("The value of marks is " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=6){
            System.out.println("ERROR 404");
        }

    }

}
