package Arrays;

import jdk.dynalink.beans.StaticClass;

import java.util.Arrays;

public class Max_item {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,55,66};
        System.out.println(max(arr));
        reverse(arr);
    }

    static int max(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[0]){
                max=arr[i];
            }
        }
        return max;
    }

    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }

    static void reverse(int[] arr){
             int start=0;
             int end=arr.length-1;

             while(start<end){
                 swap(arr,start,end);
                 start++;
                 end--;
             }
        System.out.println(Arrays.toString(arr));
    }
}
