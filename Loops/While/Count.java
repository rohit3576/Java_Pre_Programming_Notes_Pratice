
import java.util.Scanner;

class Count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number: ");
        int num= sc.nextInt();
        int i=0;
        while(num>0){
            num/=10;
            i++;
        }
        System.out.println(i);

    }
}