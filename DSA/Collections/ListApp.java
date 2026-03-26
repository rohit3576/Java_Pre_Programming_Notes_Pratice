import java.util.ArrayList;
import java.util.Scanner;

public class ListApp {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter the number you want to add : ");
       for (int i = 0; i < 5; i++) {
        arrlist.add(sc.nextInt());
           
       }
       System.out.print("Array : ");

       System.out.println(arrlist);
        for (int i = 1; i < arrlist.size(); i++) {
            int key = arrlist.get(i);
            int left = 0;
            int right = i - 1;

                while (left <= right) {
                int mid = (left + right) / 2;
                if (arrlist.get(mid) > key) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

                for (int j = i - 1; j >= left; j--) {
                arrlist.set(j + 1, arrlist.get(j));
            }

            // Insert
            arrlist.set(left, key);
        }


        
        


      
       System.out.print("Soreted array: ");
       System.out.println(arrlist);




    }
}
