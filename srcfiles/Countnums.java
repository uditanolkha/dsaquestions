// import java.util.Scanner;
public class Countnums {
    public static void main(String[]args){
        // Scanner input = new Scanner(System.in);
        int n = 101415;
        int count = 0;
        int rem;

        while(n > 0){
            rem = n%10;
            if(rem == 1){
                count++;
            }    
            n = n/10;
        }
        System.out.println(count);
    }
}
