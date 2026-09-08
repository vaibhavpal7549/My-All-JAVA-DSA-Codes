import java.util.Scanner;

public class CaesarCipher {

    public static boolean isValidText(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!((c >= 'a' && c <= 'z') || c == ' ')) {
                return false;
            }
        }
        return true;
    }

    public static String getValidText(Scanner sc, String msg) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine();

            if (isValidText(s)) {
                return s;
            }

            System.out.println("Enter text in small letters only.");
        }
    }

    public static String encrypt(String s, int k) {
        StringBuilder r = new StringBuilder();

        k = k % 26;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                r.append((char) ((c - 'a' + k) % 26 + 'a'));
            } else {
                r.append(c);
            }
        }

        return r.toString();
    }

    public static String decrypt(String s, int k) {
        StringBuilder r = new StringBuilder();

        k = k % 26;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                r.append((char) ((c - 'a' - k + 26) % 26 + 'a'));
            } else {
                r.append(c);
            }
        }

        return r.toString();
    }

    public static void bruteForce(String s) {
        System.out.println("\nPossible Decryptions:");

        for (int k = 1; k <= 25; k++) {
            System.out.println("Key " + k + " : " + decrypt(s, k));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== CAESAR CIPHER =====");
            System.out.println("1. Encryption");
            System.out.println("2. Decryption");
            System.out.println("3. Brute Force");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid Choice!");
                sc.nextLine();
                continue;
            }

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:

                    String p = getValidText(sc, "Enter Plain Text (small letters): ");

                    int k1;
                    while (true) {
                        System.out.print("Enter Key: ");

                        if (sc.hasNextInt()) {
                            k1 = sc.nextInt();
                            sc.nextLine();
                            break;
                        }

                        System.out.println("Enter a valid integer key.");
                        sc.nextLine();
                    }

                    System.out.println("Encrypted Text: " + encrypt(p, k1));
                    break;

                case 2:

                    String c = getValidText(sc, "Enter Cipher Text (small letters): ");

                    int k2;
                    while (true) {
                        System.out.print("Enter Key: ");

                        if (sc.hasNextInt()) {
                            k2 = sc.nextInt();
                            sc.nextLine();
                            break;
                        }

                        System.out.println("Enter a valid integer key.");
                        sc.nextLine();
                    }

                    System.out.println("Decrypted Text: " + decrypt(c, k2));
                    break;

                case 3:

                    String b = getValidText(sc, "Enter Cipher Text (small letters): ");

                    bruteForce(b);
                    break;

                case 4:

                    System.out.println("Program Exited.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}