public class Arrays {
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5};

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();

        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        for(int row = 0; row < matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.print(matrix);

    }
}
