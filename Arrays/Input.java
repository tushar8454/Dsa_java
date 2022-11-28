package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        arr[3]=1;
        arr[4]=1;
//        System.out.println(Array.toString(arr));

//        input using for loops
//          int[] arr1=new int[5];
//        for(int i=0;i<=arr1.length;i++){
//
//            arr1[i]=in.nextInt();
//        }
//        for(int i=0;i<=arr1.length;i++){
//            System.out.print(arr1[i]+ " ");;
//        }

//        for(int num : arr1){
//            System.out.print(num + " ");
//        }


//        array of object
        String[] str=new String[5];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
