
import java.util.Scanner;

class TtGame {
    public static void main(String[] args) {
        System.out.println("Enter the days: ");
        Scanner sc= new Scanner(System.in);
        String days= sc.nextLine();
        System.out.println(days);
        switch (days) {
            case ("Monday") :
            System.out.println("WWE Here Comes Pain");
            break;
            case("Tuesday"):
            System.out.println("Cricket 07");
            break;
            case("Wednsday"):
            System.out.println("God of war");
            break;
            case("Thursday"):
            System.out.println("IGI3");
            break;
            case("Friday"):
            System.out.println("GTA SA");
            break;
            case("Saturday"):
            System.out.println("Cheat Day");
            break;
            case("Sunday"):
            System.out.println("Everyday is gym day");
            break;
            default:
                System.out.println("Wrong input Bhaii!!!");
        }
        
    }
    
}
