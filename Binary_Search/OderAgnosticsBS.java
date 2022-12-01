package Binary_Search;

public class OderAgnosticsBS {
    public static void main(String[] args) {
    int[] arr=new int[]{5,4,3,2,1};
        System.out.println(oderagnostic(arr,5));
    }
    static int oderagnostic(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        // find whethar the array is sorted in ascdnding or descending

        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }



            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                } else if (target<arr[mid]) {
                    end=mid-1;
                }
            }else{
                if(target<arr[mid]){
                    start=mid+1;
                } else if (target>arr[mid]) {
                    end=mid-1;
                }
            }
        }


        return -1;
    }
}
