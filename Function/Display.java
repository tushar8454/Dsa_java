package Function;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        greting();
       int ans= sum();
        System.out.println(ans);
    }
    static void greting(){
        System.out.println("hyy");
    }

    static int sum(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m =in.nextInt();

        return n+m;
    }
}
