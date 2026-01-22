class Count{
    public static void main(String[] args) {
       

        int num=4567;
 
        int count=0;
        while(num>0){
        
            num/=10;
            count++;
            

        }
        System.out.println(count);
       
    }
}