package Conditons;

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int a=0,b=1;
        int n= input.nextInt();

        for (int i=3;i<=n;i++){
            int c=b;
            b=b+a;
            a=c;

        }
        System.out.println(b);

    }
}
