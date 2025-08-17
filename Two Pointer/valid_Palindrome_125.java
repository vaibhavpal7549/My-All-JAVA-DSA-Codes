// class Solution {
//     public boolean isPalindrome(String s) {
//         s = s.replaceAll("[^a-zA-Z0-9]", "");
//         s = s.toLowerCase();
//         int left = 0;
//         int right = s.length()-1;
//         while(left<right){
//             if(s.charAt(left) != s.charAt(right)){
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
        
//     }
// }


// //String is immutable;


public class valid_Palindrome_125 {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        valid_Palindrome_125 vp = new valid_Palindrome_125();
        System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama")); // Output: true
        System.out.println(vp.isPalindrome("race a car")); // Output: false
    }
}

















// public class valid_Palindrome_125 {
//     public boolean isPalindrome(String s) {
//         // Normalize the string: remove non-alphanumeric characters and convert to lowercase
//         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

//         // Initialize two pointers
//         int left = 0;
//         int right = s.length() - 1;

//         // Compare characters while moving pointers towards the center
//         while (left < right) {
//             if (s.charAt(left) != s.charAt(right)) {
//                 return false; // Characters do not match
//             }
//             left++;
//             right--;
//         }
//         return true; // All characters matched
//     }

//     public static void main(String[] args) {
//         valid_Palindrome_125 vp = new valid_Palindrome_125();
//         System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama")); // Output: true
//         System.out.println(vp.isPalindrome("race a car")); // Output: false
//     }
// }






// class Solution {
//     public boolean isPalindrome(String s) {
//         s = s.toLowerCase();
//         StringBuffer sb = new StringBuffer();

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
//                 sb.append(ch);
//             }
//         }

//         int j = sb.length() - 1;
//         for (int i = 0; i < sb.length() / 2; i++, j--) {
//             if (sb.charAt(i) != sb.charAt(j)) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }
