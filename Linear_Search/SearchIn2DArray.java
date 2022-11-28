package Linear_Search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,88,9}
        };
//        System.out.println(arr.length);
        System.out.println(search(arr,9));
        int[] ans=searchrange(arr,6);
        System.out.println(Arrays.toString(ans));

        System.out.println(searchmax(arr));
    }
    static boolean search(int[][] arr, int targert){
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                    if(arr[r][c]==targert){
                        return true;
                    }
            }
        }
        return false;
    }

    static int[] searchrange(int[][] arr, int targert){
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if(arr[r][c]==targert){
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int searchmax(int[][] arr){
        int max=arr[0][0];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if(arr[r][c]>max){
                    max=arr[r][c];
                }
            }
        }
        return max;
    }
}
