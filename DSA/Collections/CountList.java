
import java.util.ArrayList;

public class CountList {
    public static void main(String[] args) {
        ArrayList<Integer> ls= new ArrayList<>();
        
        ls.add(34);
        ls.add(356);
        ls.add(76);
        ls.add(87);
        ls.add(232);
        ls.add(34);

        System.out.println("List: "+ls);

        int count_even=0;
        int count_odd=0;


        for(int i=0; i<ls.size();i++){
            if(ls.get(i)%2==0){
                count_even++;
            }
            else{
                count_odd++;
            }

        }
        System.out.println("Count Even: "+count_even);
        System.out.println("Couunt Odd: "+count_odd);

        
    }
    
}
