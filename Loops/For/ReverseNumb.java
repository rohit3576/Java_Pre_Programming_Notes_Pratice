
import java.util.Scanner;

class ReverseNumb{
    public static void main(String[] args) {
        System.out.println("trial");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int temp=0;
        int rev=0;
        for( int i=1; num!=0; num/=10){
            System.out.println(temp=num%10);
            System.out.println(rev=rev*10+temp);

        }
    }
}