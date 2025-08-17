// package CoolCoderVP;

public class Tiling_code {

    public static int tilingP(int n){ // 2 * n (floor size)
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingP(n-1);

        //horizontal choice
        int fnm2 = tilingP(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;


    }


    public static void main(String[] args) {
        int ans = tilingP(3);
        System.out.println(ans);
    }
}
