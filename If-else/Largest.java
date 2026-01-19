class Largest{
    static int a=4234;
    static int b=3424;
    static int c=5345;
    public static void main(String[] args) {
        if(a>b && a>c){
            System.out.println("Largest number a: "+a);
        }
        else if(b>c){
            System.out.println("Largest number : "+b);
        }
        else{
            System.out.println("Largest number: "+c);
        }
        System.out.println("yo");
        
    }
}