import java.util.*;

public class Encrypt_decrypt{

    public static String encrypt(String pt, int key){
        StringBuilder ans = new StringBuilder();

        for (char ch : pt.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                ans.append((char) ((ch - 'A' + key) % 26 + 'A'));
            } else if (Character.isLowerCase(ch)) {
                ans.append((char) ((ch - 'a' + key) % 26 + 'a'));
            } else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }

    public static String decrypt(String ct, int key) {
        StringBuilder ans = new StringBuilder();

        for (char ch : ct.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                ans.append((char) ((ch - 'A' - key + 26) % 26 + 'A'));
            } else if (Character.isLowerCase(ch)) {
                ans.append((char) ((ch - 'a' - key + 26) % 26 + 'a'));
            } else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the plain text");
        String pt = sc.next();

        System.out.println("Enter the key: k");
        int key = sc.nextInt();

        String cipher = encrypt(pt, key);
        System.out.println("Encrypted text: "+ cipher);

        String org = decrypt(cipher, key);
        System.out.println("Decrypted text: "+ org);

    }
}