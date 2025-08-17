public class number_of_7_in2d_arr {

    public static int countSeven(int matrix[][],int key){

        int n = matrix.length, m = matrix[0].length;
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m ;j++){
                if(matrix[i][j] == key){
                    count++;
                }
            }
        }
        return count;


    }
    public static void main(String[] args) {
        int nums[][] = {
            {4,7,8},
            {8,8,7}
        };

        int ans = countSeven(nums, 7);

        System.out.println("The number of seven's in nums is: " + ans);
    }
}
