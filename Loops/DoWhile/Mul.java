
import java.util.Scanner;

class Mul{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENter the Number: ");
        int num= sc.nextInt();
        int i=1;
        do { 
            System.out.println(i*num);
            i++;
            
        } while (i<=10);
    }
}