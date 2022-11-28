package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension_Arrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
/*
     2D Array
             1 1 1
             1 1 1
             1 1 1
*/

//        int[][] arr=new int[3][];

        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}  //2nd index -> arr2D[2]={7,8,9}
        };
//        System.out.println(Arrays.toString(arr));
       int[][] arrs=new int[3][3];

        for(int i=0;i<arrs.length;i++){
            for(int j=0;j<arrs[i].length;j++) {
                arrs[i][j] = in.nextInt();
            }
        }

//        for(int i=0;i<arrs.length;i++){
//            for(int j=0;j<arrs[i].length;j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for(int i=0;i<arrs.length;i++){
//            System.out.println(Arrays.toString(arrs[i]));
//        }

        //enchance forloop

           for(int[] a:arr){
               System.out.println(Arrays.toString(a));
           }
    }
}
