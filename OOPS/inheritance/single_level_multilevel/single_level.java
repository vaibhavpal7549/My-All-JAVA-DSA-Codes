//single level inheritance and multilevel inheritance

class shape {

    public void area() {
        System.out.println("Displays area of shape");
    }
}

class Triangle extends shape {

    public void area(int base, int height) {
        System.out.println("Displays area of triangle");
        System.out.println("Area of triangle is: " + 0.5 * base * height);
    }
}

class EquilateralTriangle extends Triangle {

    public void area(int base, int height) {
        System.out.println("Displays area of equilateral triangle");
        System.out.println("Area of equilateral triangle is: " + 0.5 * base * height);
    }
}

public class single_level {

    public static void main(String args[]) {

        // creating object of child class
        Triangle t1 = new Triangle();
        t1.area(5, 10);
        // creating object of parent class
        shape s = new shape();
        s.area();

    }
}
