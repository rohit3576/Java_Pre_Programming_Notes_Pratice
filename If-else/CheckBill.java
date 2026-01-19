public class CheckBill {
    static int u=245;
    static int p1=1;
    static int p2=2;
    static int p3=3;
    public static void main(String[] args) {
        if(u<=100){
            System.out.println("Your electricity bill: Rs"+u*p1);
        }
        else if(u<=200){
            System.out.println("Your electicity bill: Rs"+u*p2);

        }
        else{
            System.out.println("Your electicity bill will be: Rs"+u*p3);
        }
    }
    
}
