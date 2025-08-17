import java.util.*;
public class reverse_a_string_stack {

    // Function to reverse a string using stack
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
    //Resultant String
        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            result.append(s.pop());
        }

    //Printing the reversed string
    // str = result.toString();
    //StringBuilder aur String ka Type alike hai
    // System.out.println("Reversed String: " + str);

    return result.toString();

    }
    public static void main(String[] args) {
        String str = "Shivika";
        System.out.println("Original String: " + str);
        String reversedStr = reverse(str);
        System.out.println("Reversed String: " + reversedStr);

        
    }
}

