package Sorting_Algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,3,2,5,4};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_sort(int[] arr){
        // run the steps n-1 times
        boolean swapped;
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            swapped=false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j <= arr.length-i; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;

                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
