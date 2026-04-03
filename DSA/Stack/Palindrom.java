import java.util.Stack;

public class Palindrom {
    public static void main(String[] args) {
        
        String st= "NAYAN";

        Stack ls= new Stack<>();

        for(int i=0; i<st.length();i++){
            ls.push(st.charAt(i));
        }
        System.out.println(ls);

        
        String rev="";
        System.out.println(rev);
        while(!ls.isEmpty()){
            rev+=ls.pop();
        }
        System.out.println("Rversed: "+rev);
        System.out.println(st);

        if(rev.equals(st)){
            System.out.println("It is a plaindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }


    }
    
}
