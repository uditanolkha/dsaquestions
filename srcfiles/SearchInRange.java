
public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,13,12,15,6,7,84,9,11};
        int target = 1;
        boolean ans =Search(arr, target,1,4);
        System.out.println(ans);
    }
    static boolean Search(int[] arr,int target,int start,int end){
      
        if(arr.length == 0){
            return false;
        }
    
        for(int i = start; i<=end;i++){
            int element = arr[i];
            if(element == target){
                return true;
            }
        }
        return false;
    }
    
}
