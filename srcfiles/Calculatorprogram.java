import java.util.Scanner;

public class Calculatorprogram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("ENTER THE OPERATOR :");
            char op = input.next().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                
                System.out.println("ENTER THE NUMBERS :");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    if(num2 != 0){
                    ans = num1 + num2;
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
                System.out.println(ans);
            }
            else if (op == 'X' || op == 'x'){
                break;
            }
            else{
                System.out.println("INVALID INPUT");
            }
           
        }
    }    
}
