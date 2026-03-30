import java.util.HashSet;
import java.util.Scanner;

public class hashSetTrial {
    public static void main(String[] args) {
        HashSet<String> todo = new HashSet<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.print("Enter the to do 3 list: ");

        for (int i = 0; i < 3; i++) {
            todo.add(sc.nextLine());
        }

        System.out.println("Your tasks are: ");
        System.out.println(todo);

        int t = 1;

        while (t == 1) {
            System.out.println("\n1. Add Task");
            System.out.println("2. To remove");
            System.out.println("3. Exit");
            
            System.out.print("Enter choice: ");

            t = sc.nextInt();
            sc.nextLine(); 

            switch (t) {
                case 1:
                    System.out.print("Enter new task: ");
                    todo.add(sc.nextLine());
                    System.out.println("Updated tasks: " + todo);
                    t = 1;
                    break;
                case 2:
                    System.out.print("Enter task to remove: ");
                    todo.remove(sc.nextLine());
                    System.out.println("Updated tasks: " + todo);
                    t = 1; 
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
                    t = 1;
            }
        }

        sc.close();
    }
}