package Bitwise_operator;

public class Even_or_odd {
    public static void main(String[] args) {
        int n=5;
        System.out.println(isodd(n));

    }
    private static boolean isodd(int n){
        return (n & 1)==1;
    }
}
