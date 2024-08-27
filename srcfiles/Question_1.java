//Write a program to print whether a number is even or odd, also take input from the user.
// import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class Question_1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        // System.out.print("ENTER AN INTEGER NUMBER:");
        // int num = input.nextInt();
        // if(num%2==0){
        //     System.out.println("NUMBER IS EVEN");
        // }
        // else{
        //     System.out.println("NUMBER IS ODD");
        // }

    
        // System.out.print("ENTER YOUR GOOD NAME :");
        // String name = input.nextLine();
        // System.out.println("HEY! "+name+" WELCOME TO THE WORLD OF PROGRAMMING");

       
        // System.out.println("ENTER PRINCIPLE AMOUNT, TIME AND INTEREST RATE :");
        // int p = input.nextInt();
        // int t = input.nextInt();
        // int r = input.nextInt();
        // int SI = (p*t*r)/100;
        // System.out.println("YOUR SIMPLE INTEREST IS : "+SI);

       
        // System.out.println("ENTER THE NUMBERS :");
        // int num1 = input.nextInt();
        // int num2 = input.nextInt();
        // System.out.println("ENTER THE OPERATION YOU WANNA PERFOEM :");
        // char operator = input.next().charAt(0);
        // if (operator =='+'){
        //     System.out.println(num1+num2);
        // }
        // else if (operator =='-'){
        //     System.out.println(num1-num2);
        // }
        // else if (operator =='*'){
        //     System.out.println(num1*num2);
        // }
        // else if (operator =='/'){
        //     System.out.println(num1/num2);
        // }
        // else{
        //     System.out.println("INVALID INPUT");
        // }

        // System.out.println("ENTER THE NUMBERS YOU WANT TO COMPARE :");
        // int num1 = input.nextInt();
        // int num2 = input.nextInt();
        // if(num1>num2){
        //     System.out.println(num1);
        // }
        // else if(num1==num2){
        //     System.out.println("EQUAL");
        // }
        // else{
        //     System.out.println(num2);
        // }

        System.out.println("ENTER THE AMOUNT IN RUPEE :");
        int a = input.nextInt();
        float usd = 80.85f ;
        float result = a/usd;
        System.out.println("THE AMOUNT IN USD :"+result);
    }
}
