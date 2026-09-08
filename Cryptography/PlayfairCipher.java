import java.util.*;

public class PlayfairCipher {

    static char[][] matrix = new char[5][5];

    static ArrayList<Integer> wordLengths = new ArrayList<>();

    static void createMatrix(String key) {

        boolean[] used = new boolean[26];
        StringBuilder s = new StringBuilder();

        key = key.toUpperCase();

        for (char c : key.toCharArray()) {

            if (c == 'J') {
                c = 'I';
            }

            if (!used[c - 'A']) {
                used[c - 'A'] = true;
                s.append(c);
            }
        }

        for (char c = 'A'; c <= 'Z'; c++) {

            if (c == 'J') {
                continue;
            }

            if (!used[c - 'A']) {
                used[c - 'A'] = true;
                s.append(c);
            }
        }

        int k = 0;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                matrix[i][j] = s.charAt(k++);
            }
        }
    }

    static void displayMatrix() {

        System.out.println("\n5 x 5 Matrix:");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    static int[] findPosition(char ch) {

        if (ch == 'J') {
            ch = 'I';
        }

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                if (matrix[i][j] == ch) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    static String prepareText(String text) {

        wordLengths.clear();

        String[] words = text.trim().split("\\s+");

        for (String word : words) {
            wordLengths.add(word.length());
        }

        text = text.toUpperCase().replace(" ", "");
        text = text.replace('J', 'I');

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < text.length()) {

            char a = text.charAt(i);

            if (i + 1 == text.length()) {

                ans.append(a);

                if (a == 'X') {
                    ans.append('Z');
                } else {
                    ans.append('X');
                }

                i++;
            }

            else {

                char b = text.charAt(i + 1);

                if (a == b) {

                    ans.append(a);

                    if (a == 'X') {
                        ans.append('Z');
                    } else {
                        ans.append('X');
                    }

                    i++;
                }

                else {

                    ans.append(a);
                    ans.append(b);

                    i += 2;
                }
            }
        }

        return ans.toString();
    }

    static String process(String text, boolean encrypt) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < text.length(); i += 2) {

            char a = text.charAt(i);
            char b = text.charAt(i + 1);

            int[] p1 = findPosition(a);
            int[] p2 = findPosition(b);

            int r1 = p1[0];
            int c1 = p1[1];

            int r2 = p2[0];
            int c2 = p2[1];

            // Same row
            if (r1 == r2) {

                if (encrypt) {

                    c1 = (c1 + 1) % 5;
                    c2 = (c2 + 1) % 5;
                }

                else {

                    c1 = (c1 + 4) % 5;
                    c2 = (c2 + 4) % 5;
                }
            }

            // Same column
            else if (c1 == c2) {

                if (encrypt) {

                    r1 = (r1 + 1) % 5;
                    r2 = (r2 + 1) % 5;
                }

                else {

                    r1 = (r1 + 4) % 5;
                    r2 = (r2 + 4) % 5;
                }
            }

            // Rectangle
            else {

                int temp = c1;
                c1 = c2;
                c2 = temp;
            }

            ans.append(matrix[r1][c1]);
            ans.append(matrix[r2][c2]);
        }

        return ans.toString();
    }

    static String removeBogusLetters(String text) {

        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < text.length()) {

            if (i + 2 < text.length()
                    && text.charAt(i + 1) == 'X'
                    && text.charAt(i) == text.charAt(i + 2)) {

                result.append(text.charAt(i));
                i += 2;
            }

            else if (i + 2 < text.length()
                    && text.charAt(i + 1) == 'Z'
                    && text.charAt(i) == 'X'
                    && text.charAt(i + 2) == 'X') {

                result.append(text.charAt(i));
                i += 2;
            }

            else {

                result.append(text.charAt(i));
                i++;
            }
        }

        if (result.length() > 0) {

            char last = result.charAt(result.length() - 1);

            if (last == 'X' || last == 'Z') {
                result.deleteCharAt(result.length() - 1);
            }
        }

        return result.toString();
    }

    static String restoreSpaces(String text) {

        text = removeBogusLetters(text);

        StringBuilder ans = new StringBuilder();

        int position = 0;

        for (int i = 0; i < wordLengths.size(); i++) {

            int length = wordLengths.get(i);

            if (position + length > text.length()) {
                break;
            }

            ans.append(text, position, position + length);

            position += length;

            if (i != wordLengths.size() - 1) {
                ans.append(" ");
            }
        }

        return ans.toString().toLowerCase();
    }

    static String getWordLengthInfo() {

        StringBuilder info = new StringBuilder();

        for (int i = 0; i < wordLengths.size(); i++) {

            info.append(wordLengths.get(i));

            if (i < wordLengths.size() - 1) {
                info.append(",");
            }
        }

        return info.toString();
    }

    static int getChoice(Scanner sc) {

        while (true) {

            System.out.print("Enter choice: ");

            String input = sc.nextLine();

            if (input.equals("1")
                    || input.equals("2")
                    || input.equals("3")) {

                return Integer.parseInt(input);
            }

            System.out.println("Invalid choice! Please enter 1, 2 or 3.");
        }
    }

    static String getPlainText(Scanner sc) {

        while (true) {

            System.out.print("Enter Plain Text: ");

            String text = sc.nextLine();

            if (text.length() == 0) {
                System.out.println("Plain text cannot be empty.");
                continue;
            }

            if (!text.matches("[a-z ]+")) {
                System.out.println("Invalid input!");
                System.out.println("Use only lowercase letters and spaces.");
                continue;
            }

            if (text.trim().length() == 0) {
                System.out.println("Plain text must contain at least one letter.");
                continue;
            }

            return text;
        }
    }

    static String getKey(Scanner sc) {

        while (true) {

            System.out.print("Enter Key: ");

            String key = sc.nextLine();

            if (key.length() == 0) {
                System.out.println("Key cannot be empty.");
                continue;
            }

            if (!key.matches("[a-z]+")) {
                System.out.println("Invalid key!");
                System.out.println("Key must contain only lowercase letters.");
                continue;
            }

            return key;
        }
    }

    static String getCipherTextWithInfo(Scanner sc) {

        while (true) {

            System.out.print("Enter Cipher Text with space info: ");

            String input = sc.nextLine();

            if (input.length() == 0) {
                System.out.println("Cipher text cannot be empty.");
                continue;
            }

            String[] parts = input.split("\\|", -1);

            if (parts.length != 2) {
                System.out.println("Invalid format!");
                System.out.println("Example: ABCDEFGH|6,2,5,4");
                continue;
            }

            String cipher = parts[0];
            String info = parts[1];

            if (!cipher.matches("[A-Z]+")) {
                System.out.println("Cipher text must contain only uppercase letters.");
                continue;
            }

            if (cipher.length() % 2 != 0) {
                System.out.println("Cipher text must have even length.");
                continue;
            }

            if (!info.matches("\\d+(,\\d+)*")) {
                System.out.println("Invalid space information.");
                System.out.println("Example: ABCDEFGH|6,2,5,4");
                continue;
            }

            return input;
        }
    }

    static boolean loadWordLengths(String info) {

        wordLengths.clear();

        String[] values = info.split(",");

        for (String value : values) {

            try {

                int length = Integer.parseInt(value);

                if (length <= 0) {
                    return false;
                }

                wordLengths.add(length);
            }

            catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Encryption");
            System.out.println("2. Decryption");
            System.out.println("3. Exit");

            int choice = getChoice(sc);

            // ENCRYPTION
            if (choice == 1) {

                String text = getPlainText(sc);
                String key = getKey(sc);

                createMatrix(key);

                displayMatrix();

                String prepared = prepareText(text);

                String encrypted = process(prepared, true);

                String cipherWithInfo =
                        encrypted + "|" + getWordLengthInfo();

                System.out.println("\nPrepared Text : " + prepared);
                System.out.println("Encrypted Text: " + cipherWithInfo);
            }

            // DECRYPTION
            else if (choice == 2) {

                String input = getCipherTextWithInfo(sc);

                String key = getKey(sc);

                String[] parts = input.split("\\|");

                String cipher = parts[0];
                String info = parts[1];

                loadWordLengths(info);

                createMatrix(key);

                displayMatrix();

                String decrypted = process(cipher, false);

                String finalText = restoreSpaces(decrypted);

                System.out.println("\nDecrypted Text: " + finalText);
            }

            // EXIT
            else {

                System.out.println("Program Exited.");
                break;
            }
        }

        sc.close();
    }
}