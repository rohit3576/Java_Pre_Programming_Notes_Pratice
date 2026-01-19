public class LoginCheck {
    static String username="dmin";
    static int password=1234;
    public static void main(String[] args) {
        if(username=="admin"){
            if(password==1234){
                System.out.println("Logined.......");
            }
            else{
                System.out.println("Invalid Password");
            }
        }
        else{
            System.out.println("Sbkuch Galat!!!!!!!!!!!!");
        }
    }
}
