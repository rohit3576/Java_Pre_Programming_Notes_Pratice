class LargDigit{
    public static void main(String[] args) {
        int num=4537;
        int max=0;
        while(num>0){
            int digit=num%10;
            System.out.println(digit);
            num/=10;
            if(max<digit){
                max=digit;
            }


        }
        System.out.println(max);
        
    }
}