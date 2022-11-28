package Linear_Search;

public class Main {
    public static void main(String[] args) {
     int[] nums={1,2,333,44,23,22};
     int target=242;
        System.out.println(linearsearch(nums,target));
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1

    static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length ; i++) {
            // check for element at every index if it is = target
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        // this line will execute if none of the return statements above have executed
        //hence the target not found
        return -1;
    }
}
