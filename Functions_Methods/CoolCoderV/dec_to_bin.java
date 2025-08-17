import java.util.Scanner;
public class dec_to_bin {


    public static void decTobin(int decNum){
        int pcb = decNum;
        int pow = 0;
        int binNum = 0;
        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + rem * (int)Math.pow(10, pow);
            pow++;
            decNum = decNum / 2;

        }
        System.out.println("The binary number of " + pcb + " is: " +binNum );


    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a decimal number: ");

            int dec = sc.nextInt();
            decTobin(dec);
        }
        
    }
}
