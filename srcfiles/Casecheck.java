import java.util.Scanner;

public class Casecheck {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE CHARACTER :");
        char check = input.next().charAt(0);
        //input.next().trim().charAt();

        // if(check>=97 && check<=122){
        //     System.out.println("LOWERCASE ALPHABET");
        // }
        // else if (check>=65 && check<=90){
        //     System.out.println("UPPERCASE ALPHABET");
        // }
        // else{
        //     System.out.println("WRONG INPUT");
        // }

        if(check>='a' && check<= 'z'){
            System.out.println("LOWERCASE ALPHABET");
        }else{
            System.out.println("UPPERCASE ALPHABET");
        }
    }
}
