import java.util.ArrayList;
public class CollectionArr{
    public static void main(String[] args){
    ArrayList<Object> list = new ArrayList();
    list.add("Hello");
    list.add(23);
    list.add(true);
    list.add("Hellosf");

    for(list.hasNext()){
        System.out.println(list.next());

        
    }


    }
}