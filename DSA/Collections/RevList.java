
import java.util.ArrayList;
import java.util.Arrays;

public class RevList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(12,34,12,34,45));
        ArrayList<Integer> rev= new  ArrayList<>();

        System.out.println("List: "+list);

        for(int i=list.size()-1;i>=0; i--){
            rev.add(list.get(i));

        }

        System.out.println("Reversed array: "+rev);
    }
    
}
