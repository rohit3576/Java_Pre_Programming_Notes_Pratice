
import java.util.ArrayList;

public class RotateByone {
    public static void main(String[] args) {
        System.out.println("RotateByone");

        ArrayList<Integer> ls= new ArrayList<>();

        ls.add(54);
        ls.add(567);
        ls.add(784);
        ls.add(34);
        ls.add(768);
        ls.add(98);
        System.out.println("List is : "+ls);

        int last= ls.remove(ls.size()-1);
        System.out.println("last element is : "+last);

        ls.add(0, last);
        System.out.println("Shuffled list: "+ls);
    }
    
}
