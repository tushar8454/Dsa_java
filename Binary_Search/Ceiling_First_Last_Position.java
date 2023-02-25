package Binary_Search;

import java.util.Arrays;

public class Ceiling_First_Last_Position {

    public static void main(String[] args) {
        
        int[] num={1,2,2,2,3};
        System.out.println(Arrays.toString(searchrange(num, 1)));



    }
    public static int[] searchrange(int[] nums, int target){
        int[] res=new int[]{-1,-1};
        if(nums.length==0){
            return res;
        }
        int start=0;
        int end=nums.length-1;

        while(start<end){
             int mid=start+(end-start)/2;

             if(nums[mid]>=target){
                 end=mid-1;
             }else{
                 start=mid+1;
             }
        }
        if(nums[start]!=target){
            return res;
        }
        res[0]=start;
        end=nums.length;

        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;

            }else{
                start=mid+1;
            }
        }
        res[1]=start-1;
        return res;
    }
}
