import java.util.Scanner;
public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String result = (marks>=33)?"passed":"failed";
        System.out.println("You have "+ result + " the examination.");
    }
}
