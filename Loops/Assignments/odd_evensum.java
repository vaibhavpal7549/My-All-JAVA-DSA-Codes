import java.util.Scanner;
public class odd_evensum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;

        while(true){
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if(n%2==0){
                evenSum = evenSum + n;
            }else{
                oddSum = oddSum + n;
            }
            // System.out.println("Do you want to continue? (yes/no)");
            // String choice = sc.next();
            // if(choice.equalsIgnoreCase("no")){ //uppercase ya lowercase donoan mein kaam karta 
            //     break;
            // }

            System.out.println("Do you want to continue ? press 1 for yes and 0 for no");
            int choice = sc.nextInt();
            if(choice == 0){
                break;
            }

        }
        System.out.println("Even sum is: " + evenSum);
        System.out.println("Odd sum is: " + oddSum);
        
    }
}
