
import java.util.ArrayList;

public class CountEvenOdd {
    public static void main(String[] args) {
        System.out.println("EVen odd list COunt");

        ArrayList<Integer> ls= new ArrayList<>();
        
        ls.add(45);
        ls.add(45);
        ls.add(546);
        ls.add(45);
        ls.add(4365);
        ls.add(388);
        ls.add(87);
        ls.add(98);

        System.out.println("List: "+ls);

        int count_even=0;
        int count_odd=0;

        for(int i:ls){
            if(i%2==0){
                count_even++;
            }
            else{
                count_odd++;
            }
        }
        System.out.println("Count of Even: "+count_even);
        System.out.println("Count of Odd number: "+count_odd);
    }
    
}
