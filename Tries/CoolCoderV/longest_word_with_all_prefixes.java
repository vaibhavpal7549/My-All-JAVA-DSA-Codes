

public class longest_word_with_all_prefixes {

    // Node class
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;   // end of word

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // Insert word
    public static void insert(String word) { //O(L) -> L is the length of the word
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    // Search word
    public boolean search(String word) { //O(L) -> L is the length of the word
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return curr.eow;
    }


    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }

        //lexicographically smaller a, b, c, d
        for(int i = 0; i < 26; i++){ //apple
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i + 'a');
                temp.append(ch);

                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }

                longestWord(root.children[i], temp);
                //backtracking
                temp.deleteCharAt(temp.length() - 1);
            }
        }

        //lexicograophically larger z, y, x, w
        // for(int i = 25; i >= 0; i--){ // apply
        //     if(root.children[i] != null && root.children[i].eow == true){
        //         char ch = (char)(i + 'a');
        //         temp.append(ch);

        //         if(temp.length() > ans.length()){
        //             ans = temp.toString();
        //         }

        //         longestWord(root.children[i], temp);
        //         //backtracking
        //         temp.deleteCharAt(temp.length() - 1);
        //     }
        // }
    }

    // Driver
    public static void main(String[] args) {
        
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(String word: words) {
            insert(word);
        }

        longestWord(root, new StringBuilder());
        System.out.println(ans);

    }
}

