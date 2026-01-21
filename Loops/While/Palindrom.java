
import java.util.Scanner;

class Palindrom{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENter the number: ");
        int num= sc.nextInt();
        int rev=0;
        int digit=num;
        while(num>0){
            int temp=num%10;
            rev=rev*10+temp;
            num/=10;
        }
        if(digit==rev){
            System.out.println("It is palindrome Number");
        }
        else{
            System.out.println("It is not a palindrome Number");
        }
    }
}