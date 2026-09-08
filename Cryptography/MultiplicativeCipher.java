import java.util.Scanner;

public class MultiplicativeCipher {

    // Valid keys for modulo 26
    public static boolean isValidKey(int key) {
        int[] validKeys = {3, 5, 7, 11, 17, 19, 23};

        for (int k : validKeys) {
            if (k == key) {
                return true;
            }
        }

        return false;
    }

    // Check plaintext: only lowercase a-z
    public static boolean isValidPlainText(String text) {
        return text.matches("[a-z]+");
    }

    // Check ciphertext: only uppercase A-Z
    public static boolean isValidCipherText(String text) {
        return text.matches("[A-Z]+");
    }

    // Find multiplicative inverse
    public static int findInverse(int key) {

        for (int i = 1; i < 26; i++) {

            if ((key * i) % 26 == 1) {
                return i;
            }
        }

        return -1;
    }

    // Encryption
    public static String encrypt(String text, int key) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            int pt = ch - 'a';

            int ct = (pt * key) % 26;

            result.append((char) (ct + 'A'));
        }

        return result.toString();
    }

    // Decryption
    public static String decrypt(String text, int key) {

        StringBuilder result = new StringBuilder();

        int inverse = findInverse(key);

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            int ct = ch - 'A';

            int pt = (ct * inverse) % 26;

            result.append((char) (pt + 'a'));
        }

        return result.toString();
    }

    // Brute Force
    public static void bruteForce(String cipherText) {

        int[] validKeys = {3, 5, 7, 11, 17, 19, 23};

        System.out.println("\nPossible Plain Texts:");

        for (int key : validKeys) {

            String plainText = decrypt(cipherText, key);

            System.out.println("Key " + key + " : " + plainText);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n==============================");
            System.out.println("   MULTIPLICATIVE CIPHER");
            System.out.println("==============================");
            System.out.println("1. Encryption");
            System.out.println("2. Decryption");
            System.out.println("3. Brute Force");
            System.out.println("4. Exit");
            System.out.println("==============================");

            System.out.print("Enter Choice: ");

            String choiceInput = sc.nextLine();

            int choice;

            try {
                choice = Integer.parseInt(choiceInput);

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid Choice. Please enter 1, 2, 3 or 4."
                );

                continue;
            }

            switch (choice) {

                // =========================
                // ENCRYPTION
                // =========================
                case 1:

                    String plain;

                    // Keep asking until valid plaintext
                    while (true) {

                        System.out.print(
                                "Enter Plain Text (only small letters a-z): "
                        );

                        plain = sc.nextLine();

                        if (isValidPlainText(plain)) {
                            break;
                        }

                        System.out.println(
                                "Invalid Plain Text. Use only small letters (a-z)."
                        );

                        System.out.println(
                                "Please enter the Plain Text again."
                        );
                    }

                    int eKey;

                    // Keep asking until valid key
                    while (true) {

                        System.out.print(
                                "Enter Key (3, 5, 7, 11, 17, 19, 23): "
                        );

                        String eKeyInput = sc.nextLine();

                        try {

                            eKey = Integer.parseInt(eKeyInput);

                            if (isValidKey(eKey)) {
                                break;
                            }

                            System.out.println(
                                    "Invalid Key. Choose from: 3, 5, 7, 11, 17, 19, 23"
                            );

                        } catch (NumberFormatException e) {

                            System.out.println(
                                    "Invalid Key. Please enter an integer."
                            );
                        }
                    }

                    String cipher = encrypt(plain, eKey);

                    System.out.println("Cipher Text: " + cipher);

                    break;


                // =========================
                // DECRYPTION
                // =========================
                case 2:

                    String cipherText;

                    // Keep asking until valid ciphertext
                    while (true) {

                        System.out.print(
                                "Enter Cipher Text (only capital letters A-Z): "
                        );

                        cipherText = sc.nextLine();

                        if (isValidCipherText(cipherText)) {
                            break;
                        }

                        System.out.println(
                                "Invalid Cipher Text. Use only capital letters (A-Z)."
                        );

                        System.out.println(
                                "Please enter the Cipher Text again."
                        );
                    }

                    int dKey;

                    // Keep asking until valid key
                    while (true) {

                        System.out.print(
                                "Enter Key (3, 5, 7, 11, 17, 19, 23): "
                        );

                        String dKeyInput = sc.nextLine();

                        try {

                            dKey = Integer.parseInt(dKeyInput);

                            if (isValidKey(dKey)) {
                                break;
                            }

                            System.out.println(
                                    "Invalid Key. Choose from: 3, 5, 7, 11, 17, 19, 23"
                            );

                        } catch (NumberFormatException e) {

                            System.out.println(
                                    "Invalid Key. Please enter an integer."
                            );
                        }
                    }

                    int inverse = findInverse(dKey);

                    System.out.println(
                            "Multiplicative Inverse: " + inverse
                    );

                    String decryptedText = decrypt(cipherText, dKey);

                    System.out.println(
                            "Plain Text: " + decryptedText
                    );

                    break;


                // =========================
                // BRUTE FORCE
                // =========================
                case 3:

                    String bruteCipher;

                    // Keep asking until valid ciphertext
                    while (true) {

                        System.out.print(
                                "Enter Cipher Text (only capital letters A-Z): "
                        );

                        bruteCipher = sc.nextLine();

                        if (isValidCipherText(bruteCipher)) {
                            break;
                        }

                        System.out.println(
                                "Invalid Cipher Text. Use only capital letters (A-Z)."
                        );

                        System.out.println(
                                "Please enter the Cipher Text again."
                        );
                    }

                    bruteForce(bruteCipher);

                    break;


                // =========================
                // EXIT
                // =========================
                case 4:

                    System.out.println("Program Exited.");

                    sc.close();

                    return;


                default:

                    System.out.println(
                            "Invalid Choice. Please enter 1, 2, 3 or 4."
                    );
            }
        }
    }
}