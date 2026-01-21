
import java.util.Scanner;

class SumNumb{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENter the numb: ");
        int num= sc.nextInt();
        int i=0;
        int sum=0;
        while(i<=num){
            sum+=i;
            System.out.println(sum);
            i++;
        }
        System.out.println(sum);
    }
}