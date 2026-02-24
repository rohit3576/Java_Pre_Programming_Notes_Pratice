import java.util.Scanner;

class TakeArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Final Array:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
