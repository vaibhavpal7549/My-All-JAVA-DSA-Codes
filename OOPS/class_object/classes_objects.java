
class Pen { // Here Pen class is the blueprint of the pen

    String color; //properties
    String type; //properties or class ke data

    public void write() { // Methods or functions of pen object or class ke members
        System.out.println("Writing Something");
    }
    //function name by convention small letter
    //class name by convention in java capital letter se suru hote hain

    public void printColor() {
        System.out.println(this.color);
    }
}

//new keyword jo hai vo heap memory ke andar ek jagah allocate kar deti hai jahan 
//par object ke saare data and members store hote hain
//Pen(), ye bhi ek function hota hai jisko hum constructor kahte hain
//java ke andar constructor KA KAAM hota hai objects ko construct karna
//java ke andar constructors teen types ke hote hain
//objects ko hum teen types se bana sakte hain
//1 non parameterised types
//constructors kuch bhi return nahi karta hain
//constructor sirf ek baar call kiya jaata hain ek object ke liye, vo bhi object create karte wakt
//constructor aur class ka name same hota hain
//java by default khud se hi non parameterised constructor by default hi bana deta hai
//
//
//
//
class Student {

    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //non parameterised constructor
    Student() { //Not mandatory constructor
        System.out.println("Constructor Called");
    }

    //parameterised Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        //this.age is object ki age aur age hai parameter ki age
        //
    }

    //copy constructor. c++ se ye concept aaya hai
    //ise user hi defined karta hai
    Student(Student s4) { //s3 is another object
        this.name = s4.name;
        this.age = s4.age;
    }

}

public class classes_objects {

    public static void main(String args[]) {
        Pen pen1 = new Pen(); //first object //two parentheses becoz fun is called here as the object
        //Type hota hai class ka naam
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write(); //Writing Something

        Pen pen2 = new Pen(); //second object
        pen2.color = "black";
        pen2.type = "ballpen";

        pen1.printColor(); //blue
        pen2.printColor(); //black

        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 22;

        s1.printInfo(); // aman 22

        Student s2 = new Student("Vaibhav", 24);
        s2.printInfo(); // Vaibhav 24

        Student s3 = new Student(); // ye sab objects hain
        s3.name = "Vikash";
        s3.age = 20;

        Student s4 = new Student(s3);
        s4.printInfo(); //Vikash 20

    }
}
