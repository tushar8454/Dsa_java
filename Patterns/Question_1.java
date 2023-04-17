package Patterns;

public class Question_1 {
    public static void main(String[] args) {
      patterns(3);
    }
    static void patterns(int n){
       // i = rows   j= coloums
        for (int i = 1; i <= n; i++) {
            // for every row, run the col
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println("");
        }
    }
}
