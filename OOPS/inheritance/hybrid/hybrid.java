//different different types of inheritance is called hybrid inheritance
//sab ek hi jagah mil jaae tab hybrid inheritance hota hai

class shape { // defining class //base class or parent class

    String color; // defining property

    public void area() {
        System.out.println("Displays area of shape");
    }
}

class Triangle extends shape { // defining child class inheriting the parent class properties //subclass or child class

    int base;
    int height;

    public void area() {
        System.out.println("Displays area of triangle");
        System.out.println("Area of triangle is: " + 0.5 * base * height);
    }
}

class Circle extends shape { // defining child class inheriting the parent class properties //subclass or child class

    int radius;

    public void area() {
        System.out.println("Displays area of circle");
        System.out.println("Area of circle is: " + 3.14 * radius * radius);
    }
}

public class hybrid {

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
