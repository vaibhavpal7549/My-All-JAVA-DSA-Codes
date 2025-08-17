//Time Complexity O(n)
//Space Complexity O(n)


import java.util.*;

public class decode_a_string {
    public static String decodeString(String s) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<Character> stringStack = new Stack<>();
        String temp = "";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            if (Character.isDigit(s.charAt(i))) {
                // Build the full number (could be more than one digit)
                while (Character.isDigit(s.charAt(i))) {
                    count = count * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--; // Adjust index after loop
                integerStack.push(count);
            } else if (s.charAt(i) == '[') {
                // Push the '[' onto string stack
                stringStack.push(s.charAt(i));
            } else if (s.charAt(i) == ']') {
                // Start forming the string inside the current brackets
                temp = "";
                while (!stringStack.isEmpty() && stringStack.peek() != '[') {
                    temp = stringStack.pop() + temp;
                }

                // Pop the '['
                if (!stringStack.isEmpty() && stringStack.peek() == '[') {
                    stringStack.pop();
                }

                // Get the count for repetition
                if (!integerStack.isEmpty()) {
                    count = integerStack.pop();
                }

                // Repeat the string and push back to string stack
                String repeated = temp.repeat(count);
                for (char ch : repeated.toCharArray()) {
                    stringStack.push(ch);
                }
            } else {
                // Push character to stack
                stringStack.push(s.charAt(i));
            }
        }

        // Final result from stack
        while (!stringStack.isEmpty()) {
            result = stringStack.pop() + result;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        String ans = decodeString(s);
        System.out.println(ans);  // Output: aaabcbc
    }
}
