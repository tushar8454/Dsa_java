package Functions;

public class Shadow {
    static int x=90; // this wiil be a shadow at line 7
    public static void main(String[] args) {
        int x=70; // the class variable at line 4 is shadowed by this
        System.out.println(x);
           fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
