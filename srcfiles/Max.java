import java.util.*;
public class Max {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers");
        int[] arr = new int[5];
        for(int i=0 ; i<arr.length ; i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    
        maximum(arr);
        in.close(); 
    }
static int maximum(int []arr){
    if (arr.length==0){
        return -1;
    }
    Scanner in = new Scanner(System.in);
    System.out.println("enter the range");
        int start = in.nextInt();
        int end = in.nextInt();
        if(start<end){ 
        for(int i=start ; i<=end ; i++){
        System.out.print(arr[i]+ " ");
        }
     int max = start;
    for(int i=start ; i<=end ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum number is :"+max);
        in.close();
    }
        return 1;
    }
}


