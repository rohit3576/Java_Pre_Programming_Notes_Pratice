
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        String st= "ROhit";

        Stack ls= new Stack<>();

        for(int i=0; i<st.length();i++){
            ls.push(st.charAt(i));
        }
        System.out.println(ls);


    }
    
}
