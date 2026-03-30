
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> l= new ArrayList<>();

        Scanner sc= new Scanner(System.in);

        for(int i=0; i<5; i++){
            l.add(sc.nextInt());
        }

        System.out.println("List: "+l);

        System.out.println("================================");
        //Collections.reverse(l);
        


        System.out.println("Reversed list: "+l);

        System.out.println("================================");
        // using for loop
        ArrayList<Integer> rev= new ArrayList<>();

        for (int i:l) {
            rev.add(0, i);
            
        }

        System.out.println("Reversed list using for loop: "+rev);

    }
    
}
