import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings into char array
        char[] s1charArray = s1.toCharArray();
        char[] s2charArray = s2.toCharArray();

        // Sort the char arrays
        Arrays.sort(s1charArray);
        Arrays.sort(s2charArray);

        // Check if both sorted arrays are equal
        return Arrays.equals(s1charArray, s2charArray);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first string:");
            String str1 = sc.nextLine();
            System.out.println("Enter the second string:");
            String str2 = sc.nextLine();

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            // Check for anagram
            if (isAnagram(str1, str2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }
    }
}



// What are anagrams?
// If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider race and care. In this case, race's characters can be formed into a study, or care's characters can be formed into race. Below is a java program to check if two strings are anagrams or not.




// import java.util.Arrays;

// public class anagram {
//     public static void main(String[] args) {
//         String str1 = "earth";
//         String str2 = "heart";

//         // Convert Strings to lowercase. Why? so that we don’t have to check separately for lower & uppercase.
//         str1 = str1.toLowerCase();
//         str2 = str2.toLowerCase();

//         // First check - if the lengths are the same
//         if (str1.length() == str2.length()) {
//             // Convert strings into char array
//             char[] str1CharArray = str1.toCharArray();
//             char[] str2CharArray = str2.toCharArray();

//             // Sort the char arrays
//             Arrays.sort(str1CharArray);
//             Arrays.sort(str2CharArray);

//             // If the sorted char arrays are same or identical then the strings are anagram
//             boolean result = Arrays.equals(str1CharArray, str2CharArray);

//             if (result) {
//                 System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
//             } else {
//                 System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
//             }
//         } else {
//             // Case when lengths are not equal
//             System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
//         }
//     }
// }



