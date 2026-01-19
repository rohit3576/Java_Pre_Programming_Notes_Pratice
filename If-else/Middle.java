public class Middle {
    static int a=54;
    static int b=4;
    static int c=6;
    public static void main(String[] args) {
        if((a>b && b>c)||(b>a && c>b)){
            System.out.println(b);
        }
        else if((b>a && a>c)||(c>a && a>b)){
            System.out.println(a);
        }
        else{
            System.out.println(c);
        }
    }
    
}
