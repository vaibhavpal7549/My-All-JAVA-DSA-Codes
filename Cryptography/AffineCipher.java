// encryption
// CT = (ax + b) mod m     hello -> 4
// m = 26

// decryption
// PT = a^-1( x-b ) mod m

// a must be coprime with m.
// b - 1-26

// (K * k^-1) mod 26  = 1

import java.util.*;

public class AffineCipher {

    static final int M = 26;

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static ArrayList<Integer> getCoprimes() {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < M; i++) {
            if (gcd(i, M) == 1) {
                list.add(i);
            }
        }

        return list;
    }

    static int modInverse(int a, int m) {
        for (int i = 1; i < m; i++) {
            if ((a * i) % m == 1) {
                return i;
            }
        }

        return -1;
    }

    static String encrypt(String plainText, int a, int b) {
        StringBuilder cipherText = new StringBuilder();

        for (char ch : plainText.toCharArray()) {
            int x = ch - 'a';

            // CT = (ax + b) mod m
            int encrypted = (a * x + b) % M;

            cipherText.append((char) ('A' + encrypted));
        }

        return cipherText.toString();
    }

    static String decrypt(String cipherText, int a, int b) {
        StringBuilder plainText = new StringBuilder();

        int aInverse = modInverse(a, M);

        // PT = a^-1(x - b) mod m
        for (char ch : cipherText.toCharArray()) {
            int x = ch - 'A';

            int decrypted = (aInverse * (x - b)) % M;

            if (decrypted < 0) {
                decrypted += M;
            }

            plainText.append((char) ('a' + decrypted));
        }

        return plainText.toString();
    }

    static int getA(Scanner sc) {
        ArrayList<Integer> coprimes = getCoprimes();

        System.out.println("\nValues of a coprime with 26:");

        for (int i = 0; i < coprimes.size(); i++) {
            System.out.print(coprimes.get(i));

            if (i != coprimes.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        while (true) {
            System.out.print("Enter value of a: ");

            String input = sc.nextLine();

            try {
                int a = Integer.parseInt(input);

                if (coprimes.contains(a)) {
                    return a;
                }

                System.out.println("Invalid value of a.");
                System.out.println("Please choose a value from the coprime list.");

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    static int getB(Scanner sc) {

        while (true) {
            System.out.print("Enter value of b (1-26): ");

            String input = sc.nextLine();

            try {
                int b = Integer.parseInt(input);

                if (b >= 1 && b <= 26) {
                    return b;
                }

                System.out.println("Invalid value of b.");
                System.out.println("b must be between 1 and 26.");

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    static void encryption(Scanner sc) {

        System.out.println("\n========== ENCRYPTION ==========");

        String plainText;

        while (true) {
            System.out.print("Enter plain text (small letters only): ");

            plainText = sc.nextLine();

            if (plainText.length() == 0) {
                System.out.println("Plain text cannot be empty.");
                continue;
            }

            boolean valid = true;

            for (char ch : plainText.toCharArray()) {
                if (ch < 'a' || ch > 'z') {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                break;
            }

            System.out.println(
                    "Invalid plain text. Use only small letters a-z."
            );
        }

        int a = getA(sc);

        int b = getB(sc);

        String cipherText = encrypt(plainText, a, b);

        System.out.println("\nPlain Text  : " + plainText);
        System.out.println("a            : " + a);
        System.out.println("b            : " + b);
        System.out.println("Cipher Text  : " + cipherText);
    }

    static void decryption(Scanner sc) {

        System.out.println("\n========== DECRYPTION ==========");

        String cipherText;

        while (true) {
            System.out.print("Enter cipher text (capital letters only): ");

            cipherText = sc.nextLine();

            if (cipherText.length() == 0) {
                System.out.println("Cipher text cannot be empty.");
                continue;
            }

            boolean valid = true;

            for (char ch : cipherText.toCharArray()) {
                if (ch < 'A' || ch > 'Z') {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                break;
            }

            System.out.println(
                    "Invalid cipher text. Use only capital letters A-Z."
            );
        }

        int a = getA(sc);

        int aInverse = modInverse(a, M);

        System.out.println("a inverse (a^-1) = " + aInverse);

        int b = getB(sc);

        String plainText = decrypt(cipherText, a, b);

        System.out.println("\nCipher Text : " + cipherText);
        System.out.println("a            : " + a);
        System.out.println("a inverse    : " + aInverse);
        System.out.println("b            : " + b);
        System.out.println("Plain Text   : " + plainText);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n================================");
            System.out.println("       AFFINE CIPHER");
            System.out.println("================================");
            System.out.println("1. Encryption");
            System.out.println("2. Decryption");
            System.out.println("3. Exit");
            System.out.println("================================");

            System.out.print("Choose an option: ");

            String choice = sc.nextLine();

            if (choice.equals("1")) {

                encryption(sc);

            } else if (choice.equals("2")) {

                decryption(sc);

            } else if (choice.equals("3")) {

                System.out.println("Program exited.");
                break;

            } else {

                System.out.println("Invalid option.");
                System.out.println("Please choose 1, 2 or 3.");
            }
        }

        sc.close();
    }
}