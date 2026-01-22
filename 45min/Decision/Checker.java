class Checker{
    public static void main(String[] args) {
        char c='&';
        if((c>='a' && c<='z')||(c>='A'&&c<='Z')){
            System.out.println("It is alphabet");
        }
        else if(c<='9' && c>='0'){
            System.out.println("It is a number");
        }
        else{
            System.out.println("It is special char");
        }
    }
}