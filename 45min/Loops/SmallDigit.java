class SmallDigit{
    public static void main(String[] args) {
        int num=4537;
        int min=9;
        while(num>0){
            int digit=num%10;
            System.out.println(digit);
            num/=10;
            if(min>digit){
                min=digit;
            }


        }
        System.out.println(min);
        
    }
}