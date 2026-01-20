
import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args) {
        
        System.out.println("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        switch (num%2) {
            case(0) :
            System.out.println("Even number");
                
                break;
            default:
                System.out.println("Odd number");
        }
 
    }
}