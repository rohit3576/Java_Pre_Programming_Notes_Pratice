class Cases{
    public static void main(String[] args) {
        char c='(';
        if(c>='A' && c<='Z'){
            System.out.println("It is a upper case");
        }
        else if(c>='a' && c<='z'){
            System.out.println("It is a lower case");
        }
        else{
            System.out.println("Invalid");
        }
    }
}