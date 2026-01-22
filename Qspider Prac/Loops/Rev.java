class rev{
    public static void main(String[] args) {
       
        int i=1;
        int num=457;
        int rev=0;
        while(num>0){
            int temp= num%10;
            rev= rev*10+temp;
            num/=10;

        }
        System.out.println(rev);
    }
}