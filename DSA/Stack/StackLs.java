
import java.util.Stack;

public class StackLs{
    public static void main(String[] args) {
        System.out.println("Stack");
        Stack<Integer> ls= new Stack<>();
        ls.push(21);
        ls.push(45);
        ls.push(21);
        ls.push(45);
        ls.push(21);
        ls.push(45);
        ls.push(21);
        ls.push(45);

        System.out.println(ls);
        System.out.println(ls.peek());
        System.out.println(ls);
        

    }
}