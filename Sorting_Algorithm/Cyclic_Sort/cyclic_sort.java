package Sorting_Algorithm.Cyclic_Sort;

import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr={1,2,8,3,9};
     cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclic(int[] arr){
         int i=0;
         while(i<arr.length){
             int correct=arr[i]-1;
             if(arr[i]!=arr[correct]){
                 swap(arr,i,correct);
             }else{
                 i++;
             }
         }
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
