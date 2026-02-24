import java.util.Scanner;

class Diagonal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        // Taking input
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print("Enter element ["+i+"]["+j+"]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing diagonal elements
        System.out.println("Diagonal Elements:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(i == j){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
