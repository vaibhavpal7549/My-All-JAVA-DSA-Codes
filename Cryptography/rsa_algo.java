
import java.util.*;

public class rsa_algo {

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    static long modPow(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    static long modInverse(long e, long phi) {
        long oldR = e, r = phi;
        long oldS = 1, s = 0;
        while (r != 0) {
            long q = oldR / r;
            long temp = oldR - q * r;
            oldR = r;
            r = temp;
            temp = oldS - q * s;
            oldS = s;
            s = temp;
        }
        if (oldR != 1) {
            return -1;
        }
        return (oldS % phi + phi) % phi;
    }

    static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        if (n % 2 == 0) {
            return n == 2;
        }
        for (long i = 3; i <= n / i; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static long findE(long phi) {
        for (long e = 2; e < phi; e++) {
            if (gcd(e, phi) == 1) {
                return e;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nRSA ALGORITHM");
            System.out.println("1. Encryption");
            System.out.println("2. Decryption");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Exit");
                break;
            }

            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice");
                continue;
            }

            System.out.print("Enter p: ");
            long p = sc.nextLong();

            System.out.print("Enter q: ");
            long q = sc.nextLong();

            if (!isPrime(p) || !isPrime(q) || p == q) {
                System.out.println("p and q must be different prime numbers.");
                continue;
            }

            long n = p * q;
            long phi = (p - 1) * (q - 1);

            System.out.println("n = p * q = " + n);
            System.out.println("phi(n) = " + phi);

            long e;
            System.out.print("Enter e (enter 0 to generate e automatically): ");
            e = sc.nextLong();

            if (e == 0) {
                e = findE(phi);
                System.out.println("Generated e = " + e);
            } else if (e <= 1 || e >= phi || gcd(e, phi) != 1) {
                System.out.println("Invalid e. It must satisfy 1 < e < phi(n) and gcd(e,phi(n)) = 1.");
                continue;
            }

            long d = modInverse(e, phi);

            if (d == -1) {
                System.out.println("Modular inverse does not exist.");
                continue;
            }

            System.out.println("Public Key  = (" + e + ", " + n + ")");
            System.out.println("Private Key = (" + d + ", " + n + ")");

            if (choice == 1) {
                System.out.print("Enter Plain Text (integer less than " + n + "): ");
                long pt = sc.nextLong();

                if (pt < 0 || pt >= n) {
                    System.out.println("Plain text must satisfy 0 <= PT < n.");
                    continue;
                }

                long ct = modPow(pt, e, n);
                System.out.println("Encrypted Cipher Text = " + ct);
            } else {
                System.out.print("Enter Cipher Text: ");
                long ct = sc.nextLong();

                if (ct < 0 || ct >= n) {
                    System.out.println("Cipher text must satisfy 0 <= CT < n.");
                    continue;
                }

                long pt = modPow(ct, d, n);
                System.out.println("Decrypted Plain Text = " + pt);
            }
        }

        sc.close();
    }
}
