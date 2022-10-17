package Function;

import java.util.Scanner;

public class Input_number {
    public static void main(String[] args) {

//        acess modifier (we will look in opp ) return_type name(){
//            body
//                    return statement;
//        }

        sum();
        sum();
    }
       static void sum(){
            Scanner in=new Scanner(System.in);
            System.out.println("enter first number ");
            int num1=in.nextInt();
            System.out.println("enter the second number ");
            int num2=in.nextInt();

            int s=num2+num1;
            System.out.println("sum= "+s);
        }

}
