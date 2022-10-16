package Conditons;

import java.util.Scanner;

public class Counting_occurance {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int i= input.nextInt();
         int count=0;

         while(a>0){
             int rem=a%10;
             if(rem==i){
                 count++;
             }
             a=a/10;
         }
        System.out.println(count);
    }
}
