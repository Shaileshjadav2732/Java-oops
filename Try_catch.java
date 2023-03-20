package oops;

import java.util.Scanner;

public class Try_catch {
    public static void main(String[] args) {
        int a = 454;
        Scanner sc= new Scanner(System.in);
        int s= sc.nextInt();
        try {
            int c = a / s;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("value not found");
        }
    }
}

