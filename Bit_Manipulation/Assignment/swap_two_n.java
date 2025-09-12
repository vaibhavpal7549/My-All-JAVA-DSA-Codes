import java.util.*;

public class swap_two_n {


    public static void Swap3(int a, int b){
        a = a*b;
        b = a / b;
        a = a/b;
        System.out.println("Swapped : a is " + a +" and b is now "+ b);
    }

    public static void Swap2(int a, int b){
        a = a+b;
        b = a - b;
        a = a-b;
        System.out.println("Swapped : a is " + a +" and b is now "+ b);
    }

    public static void Swap1(int a, int b){
        a = a ^ b;
        b= a ^ b;
        a = a ^b;
        System.out.println("Swapped : a is " + a +" and b is now "+ b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Swap1(a, b);
        // Swap2(a,b); 
        Swap3(a, b);
    }
}
