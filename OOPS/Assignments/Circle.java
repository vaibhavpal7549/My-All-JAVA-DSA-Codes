// // Shape.java
// public class Shape {
//     protected void display() {
//         System.out.println("Display-base");
//     }
// }

// // Circle.java
// public class Circle extends Shape {
//     @Override
//     public void display() {   // access-modifier should be public
//         System.out.println("Display-derived");
//     }
// }



// Shape.java
class Shape {
    protected void display() {
        System.out.println("Display-base");
    }
}

// Circle.java
public class Circle extends Shape {
    @Override
    public void display() {   // overriding with wider access
        System.out.println("Display-derived");
    }

    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.display();  // calls Shape's method

        Shape s2 = new Circle();
        s2.display();  // calls Circle's overridden method
    }
}
