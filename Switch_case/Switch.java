package Switch_case;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruits=in.next();


//        .equal to only checking the value not the refrence
//        if (fruits.equals("mango")){
//            System.out.println("fav. fruit ");
//        }

//        switch(fruits){
//            case "mango":
//                System.out.println("it is yellow color");
//                break;
//
//            case "apple":
//                System.out.println("its color is read");
//                break;
//
//            case "orange":
//                System.out.println("its color is orange");
//
//            default:
//                System.out.println("not match your fruit color");
//        }

        int emp=in.nextInt();
        int salary=in.nextInt();

        switch(emp){
            case 1:
                System.out.println("print salary");
                switch (salary){

                    case 20:
                        System.out.println("more than 20 thousand");
                        break;
                    case 30:
                        System.out.println("more than 30 thousand");
                        break;
                }
            break;
            case 2,3,4:
                break;

            default:
                System.out.println("not matched");
        }
    }
}
