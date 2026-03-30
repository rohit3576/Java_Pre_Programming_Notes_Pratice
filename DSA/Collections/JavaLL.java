
import java.util.LinkedList;

public class JavaLL {
    public static void main(String[] args) {
        // Linked List Implementation
        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
    
        for (String data : list) {
            System.out.println(data);
        }

    }
}
