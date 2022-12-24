package Binary_Search;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr={1,4,5,76,90};
        int ans=ceiling(arr,44);
        System.out.println(ans);
    }
    // return the index: smallest number >= target
    static int ceiling(int[] arr,int target){
        // but what if the target is greatest than the greatest number in the
        // array
        int start=0;
        int end=arr.length-1;
        if(target>arr[arr.length-1]){
            return -1;
        }


        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            } else{
                return mid;
            }
        }
        return arr[start];
    }
}
