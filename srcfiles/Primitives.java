import java.util.Scanner;
public class Primitives{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter value :");
        //int rollno =input.nextInt();
        //float price = input.nextFloat();
        //boolean check = false;
        //String name = input.nextLine();
        
        //type casting
        // int a = 258;
        // byte b=(byte)a;
        // System.out.print(b);

        //automatic type promotion
        byte b = 42;
        char c = 'r';
        int i = 345;
        short s = 5000;
        float f = 34.778f;
        double d = 34567.899000000008888888;
        double result = (b*f)+(i/c)-(d*s); 
        System.out.println((b*f)+" "+(i/c)+" "+(d*s));
        System.out.println(result);
    }
}