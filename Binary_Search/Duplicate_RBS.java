package Binary_Search;

public class Duplicate_RBS {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,2};
        System.out.println(duplicatefindpivot(arr));
    }



    static int duplicatefindpivot(int[] arr){
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
     // IF element at middle,start, end are equal then just skip the duplicates
            if(arr[start]==arr[mid] && arr[end]==arr[mid]){
                //skip the duplicates
                //NOTE: whay id these elements at start and end were the pivot???
                // check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }

            //left side is sorted, so pivot should be in right
           else if(arr[start]<arr[mid] || (arr[start]==arr[mid]&&arr[mid]>arr[end])){
               start=mid+1;
            }else {
               end=mid-1;
            }
        }
        return -1;
    }
}

