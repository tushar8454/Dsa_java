package Binary_Search;

public class Search_Mountain_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,1,2};
        System.out.println(search(arr,4));
    }

    static int search(int[] arr, int target){
        int peak=peakindex(arr);
        int firsttry=oderagnostic(arr,target,0,peak);
        if(firsttry!=1){
            return firsttry;
        }
        return oderagnostic(arr,target,peak+1,arr.length-1);
    }



    public static int peakindex(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }

    static int oderagnostic(int[] arr,int target,int start, int end){



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
