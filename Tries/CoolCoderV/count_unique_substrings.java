


public class count_unique_substrings {

    static class Node {
        Node children[] = new Node[26];   // 'a' - 'z'
        boolean eow = false;              // end of word

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // Insert in Trie - O(L)
    public static void insert(String word) {
        Node curr = root;

        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static int countNodes(Node root) { //Time Complexity: O(N)
        if (root == null) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }

        return count + 1;
    }


    public static void main(String args[]) {

        String str ="ababa";

        // insert words in Trie
        for (int i = 0; i < str.length(); i++) {
            insert(str.substring(i));
        }

        System.out.println(countNodes(root)); // 10

    }
}
