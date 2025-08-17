//Write a program to find Length of a String using Recursion.

public class length_string {

    public static int lengthOfString(String str) {
        if (str.length() == 0) {    
            return 0;
        }
        int n = 1 + lengthOfString(str.substring(1));
        return n;
    }
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(lengthOfString(str));
    }
}


// public class LengthString {
//     public static int lengthOfString(String str) {
//         int count = 0;
//         for (char c : str.toCharArray()) {
//             count++;
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         String str = "Hello";
//         System.out.println(lengthOfString(str));
//     }
// }




// public class length_string {

//     public static int lengthOfString(String str) {
//         if (str.equals("")) {
//             return 0;
//         }
//         return 1 + lengthOfString(str.substring(1));
//     }
//     public static void main(String[] args) {
//         String str = "Hello";
//         System.out.println(lengthOfString(str));
//     }
// }
