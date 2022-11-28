package Arrays;

public class Coloum_No_Fixed_Size {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {1,2}
        };
        for (int row=0;row< arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
