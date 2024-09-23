import java.util.Scanner;
import java.util.ArrayList;
public class Arraylist{
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);
        System.out.println("enter the numbers");
        // list.add(12);
        // list.add(1);
        // list.add(2);
        // list.add(01); 
        // list.add(20);
        // list.add(32);
        // list.add(78);
        // list.add(19);
        // System.out.println(list);
        // list.remove(4);
        // System.out.println(list);
        // System.out.println(list.contains(20));

        // for(int i =0 ; i<5 ; i++){
        //     list.add(in.nextInt());
        // }
        
        // for(int i =0 ; i<5 ; i++){
        //    System.out.println(list.get(i)); 
        // }
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0 ; i<3 ;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
        in.close();
    }
}