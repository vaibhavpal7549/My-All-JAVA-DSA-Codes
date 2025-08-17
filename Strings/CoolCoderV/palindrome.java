import java.util.Scanner;
public class palindrome {

    public static boolean isPalindrome(String str){
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        boolean br = isPalindrome(str);
        if(br){
            System.out.println("The string is a palindrome");
        }else{
            System.out.println("The string is not a palindrome");
        }

    }
}
