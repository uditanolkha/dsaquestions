import java.util.Scanner;

public class largest {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS YOU WANT TO COMPARE :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // if(a>b && a>c){
        //     System.out.println(a+" is largest");
        // }
        // else if(b>a && b>c){
        //     System.out.println(b+" is largest"); 
        // }
        // else{
        //     System.out.println(c+" is largest");
        // }

        // int max = Math.max(c,Math.max(a,b));

        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }

        System.out.println(max+" is the largest number");
    }
}
