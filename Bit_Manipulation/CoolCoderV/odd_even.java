public class odd_even {

    public static void oddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
        }
    }
    public static void main(String[] args) {
        oddEven(10);
        oddEven(11);
        
    }
}
