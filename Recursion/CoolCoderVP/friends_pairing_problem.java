public class friends_pairing_problem {
    
    public static int friendsPairing(int n){
        if(n==0 || n==1 || n==2) return n; //base case


        //choice
        //single

        int fnm1 = friendsPairing(n-1); //single

        //pair
        int fnm2 = friendsPairing(n-2); //pair
        
        //totWays
        int totalWays = fnm1 + (n-1)*fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        int ans = friendsPairing(3);
        System.out.println(ans);

    }
}
