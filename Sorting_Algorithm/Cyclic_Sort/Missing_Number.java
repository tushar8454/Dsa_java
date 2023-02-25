package Sorting_Algorithm.Cyclic_Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr={0,2,3};
        missing(arr);
//        System.out.println(Arrays.toString(arr));

    }

    static int missing(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] !=index) {
                return index;
            }
            
        }
        return arr.length;
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
