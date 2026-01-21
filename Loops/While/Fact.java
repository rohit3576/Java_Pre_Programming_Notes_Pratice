
import java.util.Scanner;

class Fact{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        int i=1;
        int count =0;
        while(i<=num){
            if(num%i==0){
                System.out.println(i);
                count++;
            }
            i++;
            
        }
        System.out.println(count);
    }
}