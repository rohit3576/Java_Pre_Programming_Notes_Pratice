
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Palindrom");
        ArrayList<Integer> ls= new ArrayList<>(Arrays.asList(1,3,4,3,2,1));
  

        System.out.println("List: "+ls);
        ArrayList<Integer> rev= new ArrayList<>();
        rev.addAll(ls);
        Collections.reverse(ls);
        System.out.println(ls);

        if(rev==ls){
            System.out.println("List is plaindrom");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        System.out.println("List: "+ls);
        System.out.println("Rev: "+rev);

        

        for(int i=0; i<ls.size(); i++){
            System.out.println(ls.get(i));
        }

    }
    
}
