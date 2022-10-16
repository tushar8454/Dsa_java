package Conditons;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        for(int i=1;i<20;i+=2){
//            System.out.println(i);
//        }
        Scanner input=new Scanner(System.in);
        int a=5;
        int num=10;
        while(num<20){
            System.out.println("tushar");

            if(a==input.nextInt()){
                break;
            }
            num+=1;
        }

    }
}
