import java.util.Scanner;
import java.util.Arrays;
public class Array{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //array of primitives
        // int[] arr = new int[5];
        // for(int i=0 ; i < arr.length ; i++){
        //     arr[i] = in.nextInt();
        // }
        // for(int i=0 ; i< arr.length ;i++){
        //     System.out.print(arr[i] + " ");
        // }
        // for(int num : arr){
        //     System.out.print(num + " ");
        // }
        // System.out.print(Arrays.toString(arr));

        //array of srting
        String[] str = new String[4];
        for(int i=0 ; i < str.length ; i++){
            str[i] = in.nextLine();
        }
        System.out.println(Arrays.toString(str));
        str[1]="hola";
        System.out.print(Arrays.toString(str));
        in.close();
    }
}