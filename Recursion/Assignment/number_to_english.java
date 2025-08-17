public class number_to_english {

    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printDigits(int number){
        //Base case
        if(number == 0){
            return;
        }
        int lastDigits = number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigits] + " ");
    }
    public static void main(String[] args) {
        printDigits(1234);
        
    }
}

// Time Complexity: O(log10(n))
