// public class valid_anagram {
//     public static boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }
//         int[] count = new int[26];
//         for (int i = 0; i < s.length(); i++) {
//             count[s.charAt(i) - 'a']++;
//             count[t.charAt(i) - 'a']--;
//         }
//         for (int i : count) {
//             if (i != 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         String s = "anagram";
//         String t = "nagaram";
//         System.out.println(isAnagram(s, t));

//     }
// }


//Using HashMap
import java.util.HashMap;
public class valid_anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            map.put(c1, map.getOrDefault(c1, 0) + 1);
            map.put(c2, map.getOrDefault(c2, 0) - 1);
        }
        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));

    }
}

