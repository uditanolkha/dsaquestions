import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String name = "udita";
        char target = 'u';
        System.out.println(Arrays.toString(name.toCharArray()));
        boolean ans = Search(name,target);
        System.out.println(ans);
    }
    static boolean Search(String str,char target){
        if(str.length() == 0){
            return false;
        }
        // for(int i =0; i<str.length(); i++){
        //     char alphabet = str.charAt(i);
        //     if(alphabet == target){
        //         return true;
        //     }
        // }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
