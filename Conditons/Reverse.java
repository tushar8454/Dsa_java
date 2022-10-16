package Conditons;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int a=input.nextInt();
        int revers=0;
        while(a>0){
             revers=a%10;
            a=a/10;
            System.out.print(revers);
        }

    }
}
