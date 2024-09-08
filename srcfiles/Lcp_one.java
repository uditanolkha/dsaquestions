import java.util.Scanner;

public class Lcp_one{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0;
        int product = 1;
        int temp = t;
        while(temp!=0){
            int rem = temp%10;
            sum = sum+rem;
            product = product*rem;
            temp = temp/10;
        }
        System.out.println(sum);
        System.out.println(product);
        System.out.println("Subtraction ="+(product-sum));
    }
}