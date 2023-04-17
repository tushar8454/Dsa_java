package Strings;

public class Q1 {
    public static void main(String[] args) {
        // whether check the given string is palindrome or not(palidrome is if reverse the string it look same without reverse the string)

//--------------------------------Mehtod 1 through stringbuilder---------------------------
//        StringBuilder str=new StringBuilder();
//        str= new StringBuilder("abcba");
//        System.out.println(str);
//        if(str==str.reverse()){
//            System.out.println("Yes it is palindrome");
//        }
//        else{
//            System.out.println("no it is not palindrome");
//        }

//        --------------------------------------Method 2 througgh loop ------------------------

        String str="a";
        System.out.println(ispalindrome(str));


    }

    static boolean ispalindrome(String str) {
        int s = 0;
        int e = str.length() - 1;
        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            } else {

                s++;
                e--;
            }

        }

        return true;
    }
}
