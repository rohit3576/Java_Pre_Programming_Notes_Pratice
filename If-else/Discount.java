public class Discount {
    static double b=320;
    static double twenty=b-(b*0.2);
    static double ten=b-(b*0.1);
    public static void main(String[] args) {
        if(b>=500){
            System.out.println("You get 20% discount your final price will be: rs"+twenty);
        }
        else if(b>=300){
            System.out.println("You will get 10% discount and your final price will be:  rs"+ten);
        }
        else{
            System.out.println("Sorry no discount for you your final price is same: rs"+b);
        }
    }


    
}
