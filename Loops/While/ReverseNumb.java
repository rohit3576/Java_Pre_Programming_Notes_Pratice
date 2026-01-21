
import java.util.Scanner;

class ReverseNumb{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENter the number: ");
        int num= sc.nextInt();
        int rev=0;
        while(num>0){
            int temp=num%10;
            rev=rev*10+temp;
            num/=10;
        }
        System.out.println(rev);
    }
}