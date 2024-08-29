public class Reverse {
    public static void main(String [] args){
        int n = 2345;
        int result = 0;
        int rem;
        while(n>0){
            rem = n%10;
            result = (result*10)+rem;
            n = n/10;
       }
       System.out.println(result);
    }
}
