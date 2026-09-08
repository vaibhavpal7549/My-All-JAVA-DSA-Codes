//reusability gets increased in inheritance as we can use the properties of parent class in child class

class shape { // defining class //base class or parent class

    String color; // defining property
}

class Triangle extends shape { // defining child class inheriting the parent class properties //subclass or child class

    int base;
    int height;

    public void area() {
        System.out.println(color);
        System.out.println("Area of triangle is: " + 0.5 * base * height);
    }
}

public class inheritance {

    public static void main(String args[]) {

        // creating object of child class
        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.base = 5;
        t1.height = 10;
        t1.area();

        // creating object of parent class
        shape s = new shape();

    }
}
