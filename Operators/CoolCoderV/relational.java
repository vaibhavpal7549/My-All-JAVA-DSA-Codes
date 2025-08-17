public class relational {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;
        boolean bp = a==b; 
        boolean cp = a==c;
        boolean dp = a!=b;
        boolean ep = a!=c;
        boolean fp = b==c;
        boolean gp = a>b;
        boolean hp = a<b;
        boolean ip = a>=b;
        boolean jp = a<=b;
        
        System.out.println(bp); //false
        System.out.println(cp); //true
        System.out.println();

        System.out.println(dp); //true
        System.out.println(ep); //false
        System.out.println();

        System.out.println(fp); //false
        System.out.println(gp); //false
        System.out.println(hp); //true
        System.out.println();

        System.out.println(ip); //false
        System.out.println(jp); //true

    }
}
