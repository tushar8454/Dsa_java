package Functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
fun(2,42,232,12,4,12);
multiple(4,2,"tushar","pandey");

    }
    static void multiple(int x, int b, String ...a)//(int x, String ...a,int b, )this is not possible string between the integer
    {
        System.out.println(x);
        System.out.println(Arrays.toString(a));
    }
 static void fun(int ...a){
     System.out.println(Arrays.toString(a));
 }
}
