import java.util.Scanner;

public class Type_casting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//
//        float num=input.nextFloat();
//        System.out.println(num);

//        int num=(int)(979.80f);
//        System.out.println(num);

//        automatic type promotion in expression

        int a=257;
        byte b=(byte)(a); // 257 % 256=1

        System.out.println(b);
    }
}
