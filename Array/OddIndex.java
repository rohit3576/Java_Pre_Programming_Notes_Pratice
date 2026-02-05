class OddIndex{
    public static void main(String[] args) {
        int[] arr={45,345,2345,43523,3562,35625,5667,78,67868,688478,3245,25151,52667,4642};
        for(int i=0; i<arr.length;i++){
            if(i%2==1){
                System.out.println(arr[i]);
            }
        }

    }
}