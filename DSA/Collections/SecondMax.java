
import java.util.ArrayList;

public class SecondMax {
    public static void main(String[] args) {
        System.out.println("Second max");

        ArrayList<Integer> ls= new ArrayList<>();

        ls.add(23);
        ls.add(45);
        ls.add(67);
        ls.add(99);
        ls.add(3455);
        ls.add(23);
        ls.add(45);

        int max=0;
        int Second=0;
        for(int i:ls){
            if(i>max){
                Second=max;
                max=i;
                System.out.println("iterartion max: "+max);
                System.out.println("Iteration Second: "+Second);

            }
            else if(i>Second && i!=max ){
                Second=i;
                System.out.println("else if Iteration second: "+Second);
            }
        }
        System.out.println("Maximum number: "+max);
        System.out.println("Seconf max is: "+Second);
    }
    
}
