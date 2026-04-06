
import java.util.HashMap;

public class Pratice {
    public static void main(String[] args) {
        System.out.println("Pritce of hashmap");

        HashMap<Integer,String> map= new HashMap<>();

        System.out.println(map.isEmpty());

        map.put(1, "Rohit");
        map.put(1, "Rohit");
        map.put(1, "Rohit");
        map.put(1, "Rohit");
        map.put(1, "Rohit");
        map.put(1, "Rohit");

        System.out.println(map.get(1));
        
    }
    
}
