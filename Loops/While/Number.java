
import java.util.Scanner;

class Number{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        int i=0;

        while(i<=num){
            System.out.print(i+" ");
            i++;

        }
        System.out.println(i);
    }
}