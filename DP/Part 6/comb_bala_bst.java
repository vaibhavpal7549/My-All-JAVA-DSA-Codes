

class comb_bala_bst {

    // Function to generate parentheses
    static void _printParenthesis(char str[], int pos, int n, int open, int close) {
        //TC: O(2^n), SC: O(n)
        // Base condition
        if (close == n) {
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i]);
            }
            System.out.println();
            return;
        } else {

            // If we can place closing bracket
            if (open > close) {
                str[pos] = ')';
                _printParenthesis(str, pos + 1, n, open, close + 1);
            }

            // If we can place opening bracket
            if (open < n) {
                str[pos] = '(';
                _printParenthesis(str, pos + 1, n, open + 1, close);
            }
        }
    }

    // Wrapper function
    static void printParenthesis(char str[], int n) {
        if (n > 0)
            _printParenthesis(str, 0, n, 0, 0);
        return;
    }

    public static void main(String[] args) {
        int n = 3;
        char str[] = new char[2 * n];
        printParenthesis(str, n);
    }
}