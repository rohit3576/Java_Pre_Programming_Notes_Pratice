// // Wite Method
// import java.io.FileWriter;
// public class FileHand{

//     public static void main(String[] args) {
//         try {
//             FileWriter file = new FileWriter("main.txt");
//             file.write("Hello World");
//             file.close();
//         } catch (Exception ex) {
//             System.out.println("Error : "+ex.getMessage());
//         }
//     }
// }

// // Wite Append
// import java.io.FileWriter;
// public class FileHand{

//     public static void main(String[] args) {
//         try {
//             FileWriter file = new FileWriter("main.txt", true);
//             file.write("Hello World\n");
//             file.close();
//         } catch (Exception ex) {
//             System.out.println("Error : "+ex.getMessage());
//         }
//     }
// }


// Wite Method
import java.io.FileReader;
public class FileHand{

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("main.txt");
            for (String data : file.readAllLines()) {
                System.out.println(data);
            }
            
                
            
            file.close();
        } catch (Exception ex) {
            System.out.println("Error : "+ex.getMessage());
        }
    }
}