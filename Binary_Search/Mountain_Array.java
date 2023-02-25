package Binary_Search;

public class Mountain_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,5,10,1,0,-1};
        System.out.println(peakIndex(arr));

    }

    public static int peakIndex(int[] arr){
        int start=0;

        int end=arr.length-1;

        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in dec.. part of array
                // this may be the ans, but loop at left
                // this is why end !=mid-1
                end=mid;
            }else{
                // yu are in asscending part of array
                start=mid+1;
            }
        }
        // in the end , start ==end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        //hence , when they are pointing to just one element , that is the mac one because that is what we checks say
         // more eleboration at every point of time for start and end , they have the best possible answer till that time
        // and if we are saying thar only one item is remaining hence because of above line that is the best possible

        return arr[end]; // or return end as both are =
    }
}
