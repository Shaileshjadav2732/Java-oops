package oops;
import java.util.Scanner;
        public class Nested_Try_catch {
            public static void main(String[] args) {
                int [] marks = new int[5];
                marks[0] = 27;
                marks[1] = 26;
                marks[2] =25;
                marks[3] =35;
                marks[4] =45;
                Scanner sc = new Scanner(System.in);
                boolean s = true;
                while(s) {
                    System.out.println("Enter the value of index");
                    int ind = sc.nextInt();
                    try {
                        System.out.println("Hello friend......!!!");
                        try {
                            System.out.println(marks[ind]);
                            s = false;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("!.........Please Enter valid Index.........!");
                            System.out.println("Exception in level 2");
                        }
                    } catch (Exception e) {
                        System.out.println("Exception in level 1");
                    }
                }
                System.out.println("<<<<<<<<Thank you>>>>>>>>");
            }
        }

