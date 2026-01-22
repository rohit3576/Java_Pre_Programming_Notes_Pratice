class LageOfThree{
    public static void main(String[] args) {
        int a=30;
        int b=45;
        int c=67;
        if(a>b && a>c){
            System.out.println(a+" is the largest number");
        }
        else if(b>c){
            System.out.println(b+" is the largest number");
        }
        else{
            System.out.println(c+" is the largest");
        }
    }
}