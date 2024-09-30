import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        int target = 34;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int key){
        for(int r =0; r<arr.length; r++){
            for(int c=0;c<arr[r].length ;c++){
                if(arr[r][c]==key){
                    return  new int[]{r,c};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
