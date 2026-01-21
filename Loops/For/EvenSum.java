
import java.util.Scanner;

class EvenSum{
    public static void main(String[] args) {
        System.out.println("ENter the number: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int sum=0;
        for (int i=1; i<=num; i++)
        {
            if(i%2==0){
                System.out.println(sum+=i);
            }

        }
        System.out.println(sum);
    }
}