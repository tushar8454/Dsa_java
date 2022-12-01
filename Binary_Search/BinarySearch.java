package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
    int[] arr=new int[]{1,2,3,4,55,66,77,88};
    int ans=binarysearch(arr,2);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            // find the middle element
          //  int mid=(start+end)/2; // might be possible thar (start+end)
                                   // exceds the range of integer in java
         int mid =start+(end-start)/2;

         if(target<arr[mid]){
             end=mid-1;
         } else if (target>arr[mid]) {
             start=mid+1;
         }else{
             // answer
             return mid;
         }
        }
        return -1;
    }
}
