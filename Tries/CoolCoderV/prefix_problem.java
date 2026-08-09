
public class prefix_problem {

    static class Node {
 
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {

            // Initially all children are null
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }

            // New node initially belongs to one word
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {

        Node curr = root;

        for (int i = 0; i < word.length(); i++) {

            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {

                // Create a new node if character does not exist
                curr.children[idx] = new Node();

            } else {

                // Increase frequency because another word uses this character
                curr.children[idx].freq++;
            }

            // Move to the next node
            curr = curr.children[idx];
        }

        // Mark the end of the word
        curr.eow = true;
    }

    public static void findPrefix(Node root, String ans) {

        if (root == null) {
            return;
        }

        // If only one word passes through this node,
        // then the current string is the unique prefix
        if (root.freq == 1) {
            System.out.println(ans);
            return;
        }

        // Check all 26 possible children
        for (int i = 0; i < root.children.length; i++) {

            if (root.children[i] != null) {

                // Add the current character to the prefix
                findPrefix(
                    root.children[i],
                    ans + (char) (i + 'a')
                );
            }
        }
    }

    public static void main(String args[]) {

        String arr[] = {
            "zebra",
            "dog",
            "duck",
            "dove"
        };

        // Insert all words into the Trie
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        root.freq = -1;
        // Find and print the shortest unique prefix
        findPrefix(root, "");
    }
}