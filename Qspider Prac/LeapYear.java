class LeapYear {
    static void check(int[] y){
        for(int i=0;i<y.length;i++){
            if((y[i]%4==0 && y[i]%100!=0) || y[i]%400==0)
                System.out.println(y[i]+" Leap Year");
            else
                System.out.println(y[i]+" Not Leap");
        }
    }
    public static void main(String[] args){
        int[] y={2000,2001,2024};
        check(y);
    }
}
