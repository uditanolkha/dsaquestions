import java.util.Scanner;

public class Switch {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        // String fruit = input.next();
        // switch(fruit){
        //     case("Mango"):                
        //         System.out.println("KING OF FRUITS");
        //         break;
        //     case("Apple"):                
        //         System.out.println("SWEET RED FRUIT");
        //         break;
        //     case("Orange"):                
        //         System.out.println("ROUND CITROUS FRUIT");
        //         break;
        //     case("Grapes"):                
        //         System.out.println("SMALL FRUIT");
        //         break;
        //     default:               
        //         System.out.println("INVALID INPUT");
        
        // }
        // switch(fruit){
        //     case("mango")-> System.out.println("KING OF FRUITS");
        //     case("Apple")-> System.out.println("SWEET RED FRUIT");
        //     case("Orange")->System.out.println("ROUND CITROUS FRUIT");
        //     case("Grapes")->System.out.println("SMALL FRUIT");
        //     default->System.out.println("INVALID INPUT");
        // }

        int day = input.nextInt();
        switch(day){
            case 1,2,3,4,5 -> System.out.println("weekdays");
            case 6,7 -> System.out.println("weekend");
        }
    }    
}
