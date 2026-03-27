public class friends_pairing_problem {
    
    public static int friendsPairing(int n){
        if(n==0 || n==1 || n==2) return n; //base case


        //choice
        //single

        int fnm1 = friendsPairing(n-1); //single

        //pair
        int fnm2 = friendsPairing(n-2); //pair
        int pairWays = (n-1) * fnm2;
        
        //totWays
        int totalWays = fnm1 + pairWays;
        return totalWays;

        //or directly return
        // return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);

    }
    public static void main(String[] args) {
        int ans = friendsPairing(3);
        System.out.println(ans);

    }
}
