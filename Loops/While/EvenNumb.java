
import java.util.Scanner;

class EvenNumb{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENter the number: ");
        int num = sc.nextInt();
        int i=0;
        while(i<=num){
            System.out.println(i);
            i+=2;
        }
    }
}