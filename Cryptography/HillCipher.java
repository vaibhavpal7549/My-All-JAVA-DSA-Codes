import java.util.Scanner;

public class HillCipher {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n========== Enter Choices ==========");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Brute Force");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();


            switch(choice) {


                // ================= ENCRYPTION =================

                case 1:

                    System.out.print("Enter plain text (uppercase): ");
                    String plain = sc.next();

                    while(!plain.matches("[A-Z]+"))
                    {
                        System.out.print(
                                "Invalid input! Enter uppercase letters only: ");
                        plain = sc.next();
                    }


                    // n = length of plaintext

                    int n = plain.length();

                    // Key length must be n*n

                    int requiredKeyLength = n * n;


                    System.out.print(
                            "Enter key (uppercase, "
                                    + requiredKeyLength
                                    + " letters): ");

                    String keyText = sc.next();


                    while(!keyText.matches("[A-Z]+")
                            || keyText.length() != requiredKeyLength)
                    {
                        System.out.print(
                                "Invalid key! Enter exactly "
                                        + requiredKeyLength
                                        + " uppercase letters: ");

                        keyText = sc.next();
                    }


                    // Create key matrix

                    int[][] key = new int[n][n];

                    int index = 0;


                    for(int i = 0; i < n; i++)
                    {
                        for(int j = 0; j < n; j++)
                        {
                            key[i][j] =
                                    keyText.charAt(index) - 'A';

                            index++;
                        }
                    }


                    // Display key matrix

                    System.out.println("\nKey Matrix:");

                    for(int i = 0; i < n; i++)
                    {
                        for(int j = 0; j < n; j++)
                        {
                            System.out.print(key[i][j] + " ");
                        }

                        System.out.println();
                    }


                    // ================= ENCRYPTION =================

                    String cipher = "";


                    for(int i = 0; i < n; i++)
                    {

                        int sum = 0;


                        for(int j = 0; j < n; j++)
                        {

                            int value =
                                    plain.charAt(j) - 'A';


                            sum = sum + key[i][j] * value;
                        }


                        char encrypted =
                                (char)(sum % 26 + 'A');


                        cipher = cipher + encrypted;
                    }


                    System.out.println("Cipher Text : " + cipher);

                    break;



                // ================= DECRYPTION =================

                case 2:

                    System.out.print("Enter cipher text (uppercase): ");
                    String cipherText = sc.next();


                    while(!cipherText.matches("[A-Z]+"))
                    {
                        System.out.print(
                                "Invalid input! Enter uppercase letters only: ");

                        cipherText = sc.next();
                    }


                    // n = length of cipher text

                    int n2 = cipherText.length();

                    // Key length must be n*n

                    int requiredKeyLength2 = n2 * n2;


                    System.out.print(
                            "Enter key (uppercase, "
                                    + requiredKeyLength2
                                    + " letters): ");

                    String keyText2 = sc.next();


                    while(!keyText2.matches("[A-Z]+")
                            || keyText2.length() != requiredKeyLength2)
                    {
                        System.out.print(
                                "Invalid key! Enter exactly "
                                        + requiredKeyLength2
                                        + " uppercase letters: ");

                        keyText2 = sc.next();
                    }


                    // Create key matrix

                    int[][] key2 = new int[n2][n2];

                    int index2 = 0;


                    for(int i = 0; i < n2; i++)
                    {
                        for(int j = 0; j < n2; j++)
                        {
                            key2[i][j] =
                                    keyText2.charAt(index2) - 'A';

                            index2++;
                        }
                    }


                    // Display key matrix

                    System.out.println("\nKey Matrix:");

                    for(int i = 0; i < n2; i++)
                    {
                        for(int j = 0; j < n2; j++)
                        {
                            System.out.print(key2[i][j] + " ");
                        }

                        System.out.println();
                    }


                    // ================= FIND INVERSE =================

                    int[][] inverseKey =
                            inverseMatrix(key2, n2);


                    if(inverseKey == null)
                    {
                        System.out.println(
                                "Invalid key! Matrix inverse does not exist.");

                        break;
                    }


                    // Display inverse matrix

                    System.out.println("\nInverse Key Matrix:");

                    for(int i = 0; i < n2; i++)
                    {
                        for(int j = 0; j < n2; j++)
                        {
                            System.out.print(inverseKey[i][j] + " ");
                        }

                        System.out.println();
                    }


                    // ================= DECRYPTION =================

                    String plainText = "";


                    for(int i = 0; i < n2; i++)
                    {

                        int sum = 0;


                        for(int j = 0; j < n2; j++)
                        {

                            int value =
                                    cipherText.charAt(j) - 'A';


                            sum = sum + inverseKey[i][j] * value;
                        }


                        sum = sum % 26;


                        if(sum < 0)
                        {
                            sum = sum + 26;
                        }


                        char decrypted =
                                (char)(sum + 'A');


                        plainText = plainText + decrypted;
                    }


                    System.out.println("Plain Text : " + plainText);

                    break;



                // ================= BRUTE FORCE =================

                case 3:

                    System.out.println("\n========== Brute Force ==========");

                    System.out.println(
                            "Hill Cipher uses a matrix as the key.");

                    System.out.println(
                            "Simple brute force using keys 1-25");

                    System.out.println(
                            "is not applicable to Hill Cipher.");

                    break;



                // ================= EXIT =================

                case 4:

                    System.out.println("Program Closed");

                    sc.close();

                    return;



                default:

                    System.out.println("Invalid Choice");
            }
        }
    }



    // ================= DETERMINANT =================

    static int determinant(int[][] matrix, int n)
    {

        if(n == 1)
        {
            return matrix[0][0];
        }


        if(n == 2)
        {
            return matrix[0][0] * matrix[1][1]
                    - matrix[0][1] * matrix[1][0];
        }


        int result = 0;


        for(int col = 0; col < n; col++)
        {

            int[][] subMatrix =
                    new int[n - 1][n - 1];

            int subRow = 0;


            for(int i = 1; i < n; i++)
            {

                int subCol = 0;


                for(int j = 0; j < n; j++)
                {

                    if(j != col)
                    {
                        subMatrix[subRow][subCol] =
                                matrix[i][j];

                        subCol++;
                    }
                }

                subRow++;
            }


            int sign;

            if(col % 2 == 0)
            {
                sign = 1;
            }
            else
            {
                sign = -1;
            }


            result = result
                    + sign * matrix[0][col]
                    * determinant(subMatrix, n - 1);
        }


        return result;
    }



    // ================= MODULAR INVERSE =================

    static int findInverse(int number)
    {

        for(int i = 1; i < 26; i++)
        {

            if((number * i) % 26 == 1)
            {
                return i;
            }
        }


        return -1;
    }



    // ================= MATRIX INVERSE =================

    static int[][] inverseMatrix(int[][] matrix, int n)
    {

        int det = determinant(matrix, n);

        det = det % 26;


        if(det < 0)
        {
            det = det + 26;
        }


        int inverseDet = findInverse(det);


        if(inverseDet == -1)
        {
            return null;
        }


        int[][] inverse = new int[n][n];


        if(n == 1)
        {
            inverse[0][0] =
                    (inverseDet * matrix[0][0]) % 26;

            return inverse;
        }


        for(int i = 0; i < n; i++)
        {

            for(int j = 0; j < n; j++)
            {

                int[][] subMatrix =
                        new int[n - 1][n - 1];

                int row = 0;


                for(int r = 0; r < n; r++)
                {

                    if(r == i)
                    {
                        continue;
                    }


                    int col = 0;


                    for(int c = 0; c < n; c++)
                    {

                        if(c == j)
                        {
                            continue;
                        }


                        subMatrix[row][col] =
                                matrix[r][c];

                        col++;
                    }


                    row++;
                }


                int sign;

                if((i + j) % 2 == 0)
                {
                    sign = 1;
                }
                else
                {
                    sign = -1;
                }


                int cofactor =
                        sign * determinant(subMatrix, n - 1);


                inverse[j][i] =
                        (cofactor * inverseDet) % 26;


                if(inverse[j][i] < 0)
                {
                    inverse[j][i] =
                            inverse[j][i] + 26;
                }
            }
        }


        return inverse;
    }

}

// BCDABCCDB