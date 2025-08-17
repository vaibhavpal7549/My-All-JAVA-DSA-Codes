// package Variables_and_DataTypes.Assignment;

import java.util.Scanner;
public class bill_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pen + pencil + eraser;
        System.out.println("Total cost of stationery items is: " + total);
        
    }
    
}
