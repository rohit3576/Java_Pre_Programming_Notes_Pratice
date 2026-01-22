class LargeDigit{
    public static void main(String[] args) {
       
        int i=1;
        int num=457;
        int rev=0;
        int max=0;
        while(num>0){
            int temp= num%10;
            
            if(max>temp){
                System.out.println(temp+"is greatest");
            }
            
            num/=10;

        }
        System.out.println(rev);
    }
}