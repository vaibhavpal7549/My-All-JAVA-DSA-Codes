


public class power_optimal {

    public static int OptimisedP(int x, int n){
        if(n == 0){
            return 1;
        }
        // int halfPowerSq = OptimisedP(x, n/2) * OptimisedP(x, n/2);
        int halfPower = OptimisedP(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        
        //n is odd
        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;

        }
        return halfPowerSq;

    }


    public static void main(String[] args) {
        int x = 5;
        int n = 3;
        System.out.println(OptimisedP(x, n));
    }
}
