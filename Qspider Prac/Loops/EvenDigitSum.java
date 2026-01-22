class EvenDigitSum{
    public static void main(String[] args) {
       

        int num=4574;
   
        int temp=0;
        while(num>0){
            temp= num%10;
            if(temp%2==0){
                temp+=temp;
                
            }
            num/=10;

        }
         System.out.println(temp);
       
    }
}