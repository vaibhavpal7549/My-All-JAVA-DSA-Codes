


import java.util.Scanner;

public class kadens {

    public static void kadensAlgo(int num[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int n = num.length;


        for (int i = 0; i < n; i++) {
            cs = cs + num[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);


        }
        System.out.println( "The maximum sum of the subArray is: "+ ms);

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();

            int num[] = new int[n];
            System.out.println("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            kadensAlgo(num);
        }
    }
}

