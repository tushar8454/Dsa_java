package Linear_Search;

import java.util.Arrays;

public class CountEvenNumber {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        System.out.println(count(arr));
    }
    static int count(int[] nums){
        int no=0;

        for(int num:nums){
            if(even(num)){
                no++;
            }
        }

        return no;

    }

    static boolean even(int num){
        int numberofdigits=digits(num);
        if(numberofdigits%2==0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }


        return count;

    }
}
