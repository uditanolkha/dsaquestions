import java.util.Arrays;
public class Scope {
    static int x = 90; //this will be shadowed at line 8;
    public static void main(String [] args){
        System.out.println(x);
        int x;
        // System.out.println(x); scope will begin when value is intialized
        x = 70;
        System.out.println(x);
        int a = 10; // local variable
        {
            a = 20;
            System.out.println("Local variable a = " + a);
            int c = 20;
            System.out.println("Local variable c = " + c);
        }
        System.out.println("Local variable a = " + a);
        int c = 100;
        System.out.println("Local variable c = " + c);
        fun(2,3 ,76,89,90,78);
        varArgs(3,4,"hello","hii");
        demo("nolkha","soni","jain");
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void varArgs(int a ,int b, String...v){
        System.out.println(a+" "+b+ ""+Arrays.toString(v));
    }
}
