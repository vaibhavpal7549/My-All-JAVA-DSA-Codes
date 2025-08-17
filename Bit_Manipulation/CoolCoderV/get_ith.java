import java.util.Scanner;
public class get_ith {

    public static void ith(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }


    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            System.out.println("Enter the ith value: ");
            int i = sc.nextInt();

            ith(n, i);


        }
        
    }
}
