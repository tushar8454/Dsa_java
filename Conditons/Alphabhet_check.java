package Conditons;

import java.util.Scanner;

public class Alphabhet_check {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         char word=in.next().trim().charAt(0);
         if(word>='a' && word<='z')
        System.out.println("lower case");
         else
             System.out.println("upper case");

    }
}
