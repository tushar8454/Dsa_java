package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        //syntax

        ArrayList<Integer> list=new ArrayList<Integer>();
        //          |
        //         \/
        //        Wrapper classes

//        list.add(55);
//        list.add(545);
//        list.add(535);
//        list.add(552);
//        System.out.println(list);
//        list.set(0,99);
//
//        System.out.println(list);
//        System.out.println(list.contains(554));

        //input

        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }

//        get item at any index
   for(int i=0;i<5;i++){
       System.out.println(list.get(i));
   }


        System.out.println(list);
    }
}
