

public class longest_word_in_a_dictionary {

    // Trie Node
    static class Node {

        char data;
        String word;
        boolean isEnd;
        Node[] children;

        Node(char data) {
            this.data = data;
            this.word = null;
            this.isEnd = false;
            this.children = new Node[26];
        }
    }

    static Node root = new Node('/');
    static String answer = "";

    // Insert word into Trie
    static void insert(String word) {

        Node current = root;

        for (int i = 0; i < word.length(); i++) {

            int index = word.charAt(i) - 'a';

            if (current.children[index] == null) {
                current.children[index] = new Node(word.charAt(i));
            }

            current = current.children[index];
        }

        current.isEnd = true;
        current.word = word;
    }

    // DFS
    static void dfs(Node node) {

        if (node == null) {
            return;
        }

        // If this node represents a complete word
        if (node.word != null) {

            // Longer word is better
            if (node.word.length() > answer.length()) {
                answer = node.word;
            }

            // Same length -> lexicographically smaller
            else if (node.word.length() == answer.length()
                    && node.word.compareTo(answer) < 0) {

                answer = node.word;
            }
        }

        // Visit children
        for (Node child : node.children) {

            /*
             * We can only continue if the current child
             * itself forms a complete word.
             */
            if (child != null && child.word != null) {
                dfs(child);
            }
        }
    }

    // Main function
    static String longestWord(String[] words) {

        // Insert all words
        for (String word : words) {
            insert(word);
        }

        // Search for the best word
        dfs(root);

        return answer;
    }

    // Main method
    public static void main(String[] args) {

        String[] words = {
            "w",
            "wo",
            "wor",
            "worl",
            "world"
        };

        String result = longestWord(words);

        System.out.println("Longest Word: " + result);
    }
}