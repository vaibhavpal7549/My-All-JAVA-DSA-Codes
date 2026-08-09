
import java.util.*;

public class groups_anagrams_together {

    // Trie Node
    static class TrieNode {
        List<String> data;
        TrieNode[] children;
        boolean isEnd;

        TrieNode() {
            data = new ArrayList<>();
            children = new TrieNode[26];
            isEnd = false;
        }
    }

    static TrieNode root;
    static List<List<String>> answer;

    // Main function to group anagrams
    public static List<List<String>> groupAnagrams(String[] strs) {

        answer = new ArrayList<>();
        root = new TrieNode();

        // Insert every word into Trie
        for (String word : strs) {
            insert(word);
        }

        // Traverse Trie
        dfs(root);

        return answer;
    }

    // Insert word into Trie
    static void insert(String s) {

        TrieNode current = root;

        // Sort the characters of the word.
        // All anagrams will have the same sorted form.
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        for (char c : chars) {

            int index = c - 'a';

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            current = current.children[index];
        }

        current.isEnd = true;

        // Store original word
        current.data.add(s);
    }

    // DFS to collect all anagram groups
    static void dfs(TrieNode node) {

        if (node.isEnd) {
            answer.add(new ArrayList<>(node.data));
        }

        for (int i = 0; i < 26; i++) {

            if (node.children[i] != null) {
                dfs(node.children[i]);
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        String[] strs = {
            "eat",
            "tea",
            "tan",
            "ate",
            "nat",
            "bat"
        };

        List<List<String>> result = groupAnagrams(strs);

        System.out.println("Grouped Anagrams:");

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}