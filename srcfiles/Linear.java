import java.util.*;
public class Linear {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
    //   ArrayList<Integer> list = new ArrayList<>(); 
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int[] arr = {18,23,14,6,77,12,3};
        int ans =linearSearch(arr,num);
        System.out.println(ans);
        in.close();
    }

static int linearSearch(int[] arr ,int key){
    if(arr.length == 0){
        return -1;
    }
    for (int element : arr) {
        if(key==element){
            return element;
        }
    }
    return Integer.MAX_VALUE;
}
}
