import java.util.Scanner;

public class Prime {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int result = 0;
        for(int i =2 ; i<n ; i++){
            if (n%i == 0){
               result += 1;
            }
        }
        if(result == 0){
            System.out.println(n + " is a prime number");
        }else{
            System.out.println(n + " is not a prime number");
        }
    }    
}
