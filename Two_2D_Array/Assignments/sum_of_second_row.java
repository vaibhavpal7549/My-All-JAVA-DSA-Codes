public class sum_of_second_row {

    public static int sumSecondRow(int matrix[][]){
        int m = matrix[1].length;
        int sum = 0;
        for(int i = 0; i<m; i++){
            sum += matrix[1][i];
        }
        return sum;

    }
    public static void main(String[] args) {
        int nums[][] = {
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };

        int ans = sumSecondRow(nums);
        System.out.println("The sum is: " + ans);

    }
}
