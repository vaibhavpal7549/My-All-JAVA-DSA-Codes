
public class output2 {

    public static void main(String[] args) {

        int x = 200, y = 50, z = 100;

        if (x > y && y > z) { //True and False
            System.out.println("Hello"); //Will not be printed
        }

        if (z > y && z < x) { //True and True
            System.out.println("Java"); //Will be printed
        }

        if ((y+200) < x && (y+150) < z) { //False and False
            System.out.println("Hello Java"); //Will not be printed
        }

    }

}

