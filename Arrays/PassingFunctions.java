package Arrays;

import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
   int[] nums=new int[5];
   nums= new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums));
        change(nums);

        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=22;
    }
}
