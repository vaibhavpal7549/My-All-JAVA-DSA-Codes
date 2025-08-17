


public class power_n {

    public static int powert(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = powert(x, n-1);
        int xn = x * xnm1;
        return xn;

    }


    public static void main(String[] args) {
        int x = 5;
        int n = 3;
        System.out.println(powert(5, 3));
    }
}
