import java.util.Scanner;

public class Palindome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp = n;
        int result = 0;
        int rem ;

        while(temp != 0){
            rem = temp % 10;
            result = (result * 10 ) + rem ;
            temp /= 10;
        }

        if(result == n){
            System.out.println(n + " is a palindrome");
        }else{
            System.out.println(n + " is not a palindrome");
        }
    }    
}
