class Trie {

    private static class Node {
        Node[] children;
        boolean isEnd;

        Node() {
            children = new Node[26];
            isEnd = false;
        }
    }

    private Node root;

    public Trie() {
        root = new Node();
    }

    // Insert word
    public void insert(String word) {
        Node curr = root;

        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.isEnd = true;
    }

    // Search complete word
    public boolean search(String word) {
        Node node = traverse(word);
        return node != null && node.isEnd;
    }

    // Search prefix
    public boolean startsWith(String prefix) {
        return traverse(prefix) != null;
    }

    // Helper function for search & prefix
    private Node traverse(String str) {
        Node curr = root;

        for (char ch : str.toCharArray()) {
            int idx = ch - 'a';

            if (curr.children[idx] == null) {
                return null;
            }

            curr = curr.children[idx];
        }

        return curr;
    }

    // Delete word
    public void delete(String word) {
        deleteHelper(root, word, 0);
    }

    private boolean deleteHelper(Node curr, String word, int depth) {

        if (curr == null) return false;

        // If last character
        if (depth == word.length()) {

            if (!curr.isEnd) return false;

            curr.isEnd = false;

            // If node has no children, delete it
            return isEmpty(curr);
        }

        int idx = word.charAt(depth) - 'a';

        if (deleteHelper(curr.children[idx], word, depth + 1)) {

            curr.children[idx] = null;

            return !curr.isEnd && isEmpty(curr);
        }

        return false;
    }

    private boolean isEmpty(Node node) {
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                return false;
            }
        }
        return true;
    }
}
