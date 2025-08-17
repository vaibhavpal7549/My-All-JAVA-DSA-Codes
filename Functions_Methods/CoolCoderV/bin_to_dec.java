import java.util.Scanner;
public class bin_to_dec {

    public static void binToDec(int binNum){
        int pow = 0;
        int dec = 0;

        while(binNum > 0){
            int ld = binNum % 10;
            dec = dec + ld * (int)Math.pow(2, pow);
            pow++;
            binNum = binNum / 10;
            
        }
        System.out.println("The converted binary number to decimal is " + dec);
    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a binary number:");
            int n = sc.nextInt();

            binToDec(n);
        }

        

    }
}
