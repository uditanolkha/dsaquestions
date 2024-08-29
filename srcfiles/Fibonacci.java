import java.util.Scanner;
public class Fibonacci {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("ENTER THE Nth NUMBER :");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int temp;
        System.out.println(a);
        System.out.println(b);
        for(int i=3;i<=n;i++){
            temp = a+b;
            System.out.println(temp);
            a = b;
            b = temp;
        }
   
    }
}
