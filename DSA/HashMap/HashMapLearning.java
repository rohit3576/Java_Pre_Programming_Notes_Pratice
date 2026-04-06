
import java.util.HashMap;




public class HashMapLearning {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Rohit" );
        map.put(2, "Om" );
        map.put(3, "Vikash" );
        // map.remove(1);

        System.out.println(map);
        for (int i = 1; i <= map.size(); i++) {
            System.out.println(map.get(i));
        }

        for (Integer key : map.keySet()) {
            System.out.println(key+"--->"+map.get(key));
        }

    }
}
