package Conditons;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        System.out.print("plzzz enter the salary than i gave you credit card ");

        Scanner input= new Scanner(System.in);
        int salary=input.nextInt();
        if(salary>10000){
            System.out.println("you are permitted for cc");
        }
             else{
            System.out.println("no");
        }
    }
}
