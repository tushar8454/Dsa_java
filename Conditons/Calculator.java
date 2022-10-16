package Conditons;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int ans=0;

        Scanner in=new Scanner(System.in);

//        take the operator that you want


        while(true){
            System.out.print("Enter the operator ");
            char op=in.next().trim().charAt(0);

            if(op=='+'||op=='-'||op=='/'||op=='*'){
                System.out.print("enter the first number ");
                int n=in.nextInt();
                System.out.print("enter the second number ");
                int m=in.nextInt();
                if(op=='+')
                ans=n+m;
                if (op=='-')
                    ans=n-m;
                if (op=='/')
                    ans=n/m;
                if (op=='*')
                    ans=n*m;

            } else if (op=='x' || op=='X') {
                break;

            }
            else {
                System.out.println("invalid operator !");
                break;
            }
            System.out.println(ans);
        }

    }

}
