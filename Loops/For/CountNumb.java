
import java.util.Scanner;

class CountNumb{
    public static void main(String[] args) {
        System.out.println("ENhdhgfds");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int i=0;
        for(i=0; num!=0; i++){
            System.out.println(num/=10);
        }
        System.out.println(i);
    }
}