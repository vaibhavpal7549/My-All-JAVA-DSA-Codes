import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float rad = sc.nextFloat();
        // float area = (float) (3.14 * Math.pow(rad, 2));
        float area = 3.14f * rad * rad;
        System.out.println(area);
    }
}
