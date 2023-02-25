package Binary_Search;

public class Rotated_Count {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(count(arr));

    }

    private static int count(int[] arr){
        int pivot=findpivot(arr);
        return pivot+1;
    }

    private static int findpivot(int[] arr){

        int start=0;
        int end=arr.length-1;
        while (start<=end){
          int mid=start+(end-start)/2;
          if(start<mid && arr[mid-1]>arr[mid]){
              return mid-1;
          }
          if(end>start && arr[mid]>arr[mid+1]){
              return mid;
          } 

          if(arr[mid]==arr[end] && arr[mid]==arr[start]){
              if(arr[start]>arr[start+1]){
                  return start;
              }
              start++;
              if(arr[end-1]>arr[end]){
                  return end-1;
              }
          }
          else if(arr[start]<arr[mid] || (arr[mid]==arr[start] && arr[mid]>arr[end])){
              start=mid+1;
          }else{
              end=mid-1;
          }
        }
        return -1;
    }
}
