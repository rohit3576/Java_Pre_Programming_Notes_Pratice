class DigitCheck{
    public static void main(String[] args) {
        int num=3;
        if(num<1000 && num>100){
            System.out.println("3 digit");
        }
        else if(num<100 && num>10){
            System.out.println("2 digit");
        }
        else if(num<10){
            System.out.println("1 digit");
        }
        else{
            System.out.println("more than 3 digit");
        }
    }
}