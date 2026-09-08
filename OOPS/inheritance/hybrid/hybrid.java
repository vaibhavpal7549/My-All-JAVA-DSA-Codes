
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
