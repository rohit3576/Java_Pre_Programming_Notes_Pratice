
import java.util.LinkedList;

public class List{
    public static void main(String[] args) {
        System.out.println("Linked List");

        LinkedList ls= new LinkedList<>();

        ls.add(45);
        ls.add(32);
        ls.add(66);
        ls.add(85);
        ls.add(45);
        ls.add(4985);

        System.out.println("List: "+ls);
        
    }
}