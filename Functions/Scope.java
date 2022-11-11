package Functions;

public class Scope {
    public static void main(String[] args) {
//        int a=10; it is intialise the varialbe
        int b=20;

        {
//            a=79; it updated a intialise variable
            int c=88;
//            Values intialised in this block, will remain in block
//            but change the variable value outside the block

        }

        System.out.println(b);
        System.out.println(b);

//       Scopping in for loops
        for (int t=0;t<5;t++){

        }
//        { System.out.println(t); } we cant access the value
//        of t in outside the loop
    }

    static void random(){
        int a=140;
    }
}
