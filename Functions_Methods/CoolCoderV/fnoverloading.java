public class fnoverloading {


//function to calculate sum of two numbers
    public static int sum(int a, int b){
        return a + b;

    }
//function to calculate sum of three numbers
    public static int sum(int d, int b, int c){
        return d + b + c;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));
        
    }
}
