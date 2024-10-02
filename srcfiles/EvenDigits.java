public class EvenDigits {
    public static void main(String[] args){
    int[] arr = {12,345,2,6,7896};
    System.out.println(findNumbers(arr));
    System.out.println(digits2(34567));
    }

    static int findNumbers(int[] arr){
        int count = 0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even (int num){
        int numbers  = digit(num); 
        return numbers%2 == 0;
    }
    static int digit(int num){
        if(num<0){
            num*=-1;
        }
        if(num==0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    static int digits2(int num){
        if(num<0){
            num*=-1;
        }
        return (int)(Math.log10(num)) +1;  
    }
}
