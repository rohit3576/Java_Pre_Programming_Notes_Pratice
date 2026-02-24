class MaxRow {

    public static void main(String[] args) {

        int[][] arr = {
            {3, 8, 1},
            {6, 2, 9},
            {4, 7, 5}
        };

        for(int i = 0; i < arr.length; i++){

            int max = arr[i][0];   // assume first element is max

            for(int j = 1; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }

            System.out.println("Max in row " + i + " = " + max);
        }
    }
}
