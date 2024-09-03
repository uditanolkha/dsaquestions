import java.util.Scanner;
public class Functions {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // Greetings();
        // int ans = sum();
        // System.out.println(ans);
        // String message = myGreet("udita");
        // System.out.println(message);
        int answer = sum2(num1 , num2);
        System.out.println(answer);
    }
static String myGreet(String name){
    return "Hello, " + name + "!";
}
static void Greetings(){
    System.out.println("Hello, World!");
}
static int sum(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number 1: ");
    int a = sc.nextInt();
    System.out.print("Enter number 2: ");
    int b = sc.nextInt();
    int c = a + b;
    return c;
}
static int sum2(int num1,int num2){
  return num1+num2;
}
}