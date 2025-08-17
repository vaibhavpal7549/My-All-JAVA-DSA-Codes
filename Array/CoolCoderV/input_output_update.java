import java.util.Scanner;
public class input_output_update {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)){

            int marks[] = new int[1000];
            // int phy;
            // phy = sc.nextInt();

            marks[0] = sc.nextInt();
            marks[1] = sc.nextInt();
            marks[2] = sc.nextInt();

            System.out.println("Marks of physics: "+marks[0]);
            System.out.println("Marks of chemistry: "+marks[1]);
            System.out.println("Marks of maths: "+marks[2]);

            marks[2] = 100; //updated marks

            marks[2] = marks[2] + 1;
            System.out.println("Updated marks of maths: "+marks[2]);
            int percentage = (marks[0] + marks[1] + marks[2])/3;
            System.out.println("The percentage is: " + percentage);

            //length of array
            int length = marks.length;
            System.out.println(length);
        }
        
    }
}
