public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr ={
            {1,4,3},
            {7,3,4},
            {8,1,2}
        };
        System.out.println(findMaximum(arr));
    }
    static int findMaximum(int[][] arr){
        //person:row
        //account:col
        int max = Integer.MIN_VALUE;
        for(int[] person : arr ){
            int sum = 0;
            for(int account : person){
                sum+= account;
            }
            if(max < sum){
                max = sum;
            }
        }
     return max;   
    }
}
