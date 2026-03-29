
import java.util.ArrayList;
import java.util.Scanner;

public class SumList {
    public static void main(String[] args) {
        ArrayList<Integer> l= new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        System.out.println("ENter the  elements in list: ");
        for (int i = 0; i < 5; i++) {
            l.add(sc.nextInt());
        }
        System.out.println("List: "+l);

        int sum=0;
        for(int i:l){
            sum+=i;
        }
        System.out.println("Sum of list: "+sum);

        System.out.println("===============================");
        //using stream
        int sum2= l.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum using stream: "+sum2);

        System.out.println("===============================");
        // using get method

        int sum3=0;

        for(int i=0; i<l.size(); i++){
            sum3+=l.get(i);
            System.out.println("Iteration1: "+sum3);
        }

        System.out.println("FInal sum: "+sum3);

    }
}
