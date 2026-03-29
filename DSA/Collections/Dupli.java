import java.util.HashSet; 

public class Dupli{
    public static void main(String[] args) {
        int[] arr = {1,234,1234,1,2,3,4121,3,2};

        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        HashSet<Integer> set= new HashSet<>();

        for (int i:arr) {
            set.add(i);

            
        } 
        System.out.println(set);
    }
}