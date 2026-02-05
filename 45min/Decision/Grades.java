class Grades{
    public static void main(String[] args) {
        int marks=25;
        if(marks>100){
            System.out.println("Out of bound");
        }
        else{
            if(marks>=85 && marks<=100){
            System.out.println("A grade");
        }
        else if(marks>=75 && marks<85){
            System.out.println("B grade");
        }
        else if(marks>=35 && marks<75){
            System.out.println("C grade");
        }
        else{
            System.out.println("failed");
        }
        }
    }
}