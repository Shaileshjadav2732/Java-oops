package oops;

import java.util.ArrayList;

public class Araaylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>(6);
        ArrayList<Integer> l2= new ArrayList<>(9);
        l1.add(27);
        l1.add(37);
        l1.add(57);
        l1.add(87);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l1.add(0,45);
        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
