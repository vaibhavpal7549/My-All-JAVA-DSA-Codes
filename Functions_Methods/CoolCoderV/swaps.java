public class swaps {

    public static void swapNum(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b); // a = 20, b = 10
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        swapNum(a, b);
        System.out.println(a + "," + b); // a = 10, b = 20
        
        
    }
}
