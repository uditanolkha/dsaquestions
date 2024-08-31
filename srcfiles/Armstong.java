import java.util.Scanner;

public class Armstong {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        int rem;
        int digit = 0;
        while (num != 0) {
            num = num/10;
            digit += 1;
        }
        num = n;
        while(num>0){
            rem = num%10;
            sum = (int)(sum + Math.pow(rem,digit));
            num=num/10;
         }
        
        if (n == sum){
            System.out.println("Armstrong number");
         }
        else{
            System.out.println("Not an Armstrong number");
         }
        }    
}
