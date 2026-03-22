import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter w= new FileWriter("RohitBio.txt");
            w.write("This is ROhit Pawar here \n lorem");
            System.out.println("FIle Created Succefully");
            w.close();

            
        } catch (Exception e) {
            System.out.println("We got exteption"+e.getMessage());
        }

        
    }
    
}
