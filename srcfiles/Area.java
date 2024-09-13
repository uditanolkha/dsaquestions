import java.util.Scanner;
public class Area{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius");
    double rad = sc.nextInt();
    // double ans = circle(rad);
    double ans = sphere(rad);
    System.out.println(ans);
}static double circle(double rad){
    double area = 3.14*(Math.pow(rad,2));
    return area;
}
static double sphere(double rad){
    double area = 4*3.14*(Math.pow(rad,2));
    return area;
}
}