package Patterns;

public class Question_5 {
    public static void main(String[] args) {
 pattern(4);
    }

    static void pattern(int n){
       for(int row=0;row<2*n;row++){
           int totalcolsrow=row>n ? 2*n - row: row;
           for(int col=0;col<=totalcolsrow;col++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
