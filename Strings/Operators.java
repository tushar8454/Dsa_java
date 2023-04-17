package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char) ('a'+1));

        System.out.println("a"+1);
        //this is same after a few steps:"a"+"1"
        // integer will be converted to Integer that will call tostring()

        System.out.println("tushar"+new ArrayList<>());
        System.out.println("kunal"+new Integer(77));

//        they dint work bcz one of then are not primitve
//        System.out.println(new Integer(56)+new ArrayList<>());

//        but this can work bcz one of then is strings
        System.out.println(new Integer(56)+ " "+new ArrayList<>());


    }
}
