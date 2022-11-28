package Linear_Search;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={2,3,10,5,6,1};
        System.out.println(findmin(arr));
    }
    static int findmin(int[] arr){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
