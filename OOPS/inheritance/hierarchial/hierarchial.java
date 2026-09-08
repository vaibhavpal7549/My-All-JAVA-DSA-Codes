
class shape {

    String color;

    void area() {
        System.out.println("Area of shape");
    }
}

class Triangle extends shape { // defining child class inheriting the parent shape class properties

    int base;
    int height;

    void area() {
        System.out.println("Area of triangle");
        System.out.println("Area of triangle is: " + 0.5 * base * height);
    }
}

class Circle extends shape { // defining child class inheriting the parent shape class properties

    int radius;

    void area() {
        System.out.println("Area of circle");
        System.out.println("Area of circle is: " + 3.14 * radius * radius);
    }
}

public class hierarchial {

    public static void main(String args[]) {

        // creating object of child class
        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.base = 5;
        t1.height = 10;
        t1.area();

        // creating object of child class
        Circle c1 = new Circle();
        c1.color = "Blue";
        c1.radius = 7;
        c1.area();

        // creating object of parent class
        shape s = new shape();
        s.color = "Green";
        s.area();
    }
}
