
import java.util.ArrayList;
import java.util.Scanner;

public class MaxList {
    public static void main(String[] args) {
        ArrayList<Integer> l= new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        System.out.println("ENter the elementes in list: ");


        for(int i=0; i<5; i++){
            l.add(sc.nextInt());
          
        }
        System.out.println("List: "+l);

        int max=0;

        for(int i:l){
            if(i>max){
                max=i;
            }
            else{
                continue;
            }
            System.out.println("Iteration: "+max);
        }
        System.out.println("Max element in list: "+max);

    }
    
}
