import java.util.Scanner;
import java.util.Arrays;
public class Twodimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        
        for (int row=0 ; row<arr.length ; row++){
            for(int col=0 ; col<arr[row].length ; col++){
                arr[row][col] = in.nextInt(); 
            }
        }
        //bestway
        // for(int[] a : arr){
        //     System.out.println(Arrays.toString(a));
        // }
        // for(int row =0 ; row<arr.length ;row++){
        //     for(int col=0 ;col<arr[row].length; col++){
        //         System.out.print(arr[row][col]);
        //     }
        //     System.out.println();
        // }
        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        in.close();
    }
}
