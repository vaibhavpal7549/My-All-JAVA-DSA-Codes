

public class reverse_a_string_344 {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap the characters at left and right pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move the pointers towards each other
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        //reverse_a_string_344 solution = new reverse_a_string_344();
        char[] s = {'H', 'e', 'l', 'l', 'o'};
        // reverse_a_string_344.reverseString(s);
        reverseString(s);
        // solution.reverseString(s);
        System.out.println(s); // Output: [o, l, l, e, h]
    }
}



/*
Explanation:
Two Pointers: Initialize two pointers, left at the beginning (index 0) and right at the end (index s.length - 1).
Swapping: In each iteration of the while loop:
Swap the characters at left and right indices.
Increment the left pointer and decrement the right pointer to move towards the center.
Termination: The loop continues until left is no longer less than right, ensuring all characters are swapped.
This approach ensures the string is reversed in-place with a time complexity of 
O(n) and a space complexity of 𝑂(1)

 */
