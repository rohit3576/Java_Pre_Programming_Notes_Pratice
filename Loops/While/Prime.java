import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        int i=2;
        boolean isPrime=true;
        while(i<=num/2){
               if (num % i == 0) {
                isPrime = false;
                System.out.println(i);
                break;
            }
            i++;

            }
              if (isPrime && num > 1) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
            

        }
    }
