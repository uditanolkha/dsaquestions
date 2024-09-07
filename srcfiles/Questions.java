// import java.util.Scanner;
public class Questions {
    public static void main(String [] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // boolean ans = prime(n);
        // boolean ans = isArmstrong(n);
        // System.out.println(ans);

        for (int i=100 ; i<1000 ; i++){
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }       
    }
    static boolean prime(int n){
       if(n<=1){
            return false;
       }
       int c = 2;
       while(c*c<=n){
        if(n%c==0){
            return false;
        }
        c++;
       }
       return c*c>n;
    }
    static boolean isArmstrong(int n ){
        int temp = n;
        int sum = 0;
        int digits = 0;
        while(temp != 0){
            temp = temp/10;
            digits++;
        }
        temp =n;
        while(temp != 0){
            int rem = temp % 10;
            sum =(int)(sum + Math.pow(rem,digits));
            temp = temp/10;
    }
    return (sum == n);
}
}
