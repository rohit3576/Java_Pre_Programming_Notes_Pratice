
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Duplicate{
    public static void main(String[] args) {
        ArrayList<Integer> ls= new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the Elements: ");

        for(int i=0; i<5; i++){
            ls.add(sc.nextInt());
            System.out.println("iterartion : "+i+" = "+ls.get(i));
        }

        System.out.println("Final List: "+ls);

        LinkedHashSet<Integer> ls2= new LinkedHashSet<>();

        for(int i:ls){
            ls2.add(i);

            System.out.println("Iterration: "+i);

        }


        System.out.println("FInal set: "+ls2);




        
    }
}