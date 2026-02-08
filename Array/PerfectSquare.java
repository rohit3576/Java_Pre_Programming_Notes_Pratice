class PerfectSquare{
    public static void main(String[] args) {
        int[] arr={8,9,45,49,81};
        for(int i=0; i<100; i++){
            if(i*i==arr.length){
                System.out.println(arr[i]);
            }
        }

        
    }
}