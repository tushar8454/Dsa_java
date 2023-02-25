package Binary_Search;

public class Rotated_Binary_Search_RBS {
    public static void main(String[] args) {
     int[] arr={2,1};
        System.out.println(findpivot(arr));
        System.out.println(search(arr,1));
    }

    static int search (int[] nums, int target){
        int pivot=findpivot(nums);
        //
        //if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            //just do normal binary search
            return binarysearch(nums,target,0,nums.length-1);
        }

        // if pivot is found  , you have found 2 asc sorted arrays
        if(nums[pivot]==target){
            return pivot;
        }

        if(target>=nums[0]){
            return binarysearch(nums,target,0,pivot-1);
        }

        return binarysearch(nums,target,pivot+1,nums.length-1);
    }

    static int binarysearch(int[] arr,int target,int start , int end){

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

    // this will not work for duplicate values

    static int findpivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            // 4 cases over here


            int mid=start+(end-start)/2;

            if (mid<end && arr[mid]>arr[mid+1]) {
                return mid;

            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
