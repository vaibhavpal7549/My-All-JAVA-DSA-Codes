// Abstract class
//ek blueprint hai yaani ek khyaal hai, jisko sach nahi karna hai, yaani ki vo savh nahi hai
//bas vo ek implemented hai usko hum use nahi kar sakte hain
//bas vo exist karta hai, aur uske andar ke methods ko hum implement kar sakte hain

//jab bhi hum derived class ka koi object create karte hain tab, sabse pahle base class ka constructor call hota hai, aur phir derived class ka constructor call hota hai -> isko java ke andar constructor chaining kehte hain
abstract class Animal {

    abstract void walk();

    Animal() { //Constructor
        System.out.println("You are creating an animal");
    }

    public void eat() {
        System.out.println("eats food");
    }
}

class Horse extends Animal {

    Horse() { //Constructor
        System.out.println("You are creating a horse");
    }

    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {

    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class abstraction {

    public static void main(String[] args) {

        Horse h1 = new Horse();

        Horse h = new Horse();
        h.walk(); //walks on 4 legs
        h.eat(); //eats food

        Chicken c = new Chicken();
        c.walk(); //walks on 2 legs

        Animal a = new Horse(); //upcasting
        a.walk(); //walks on 4 legs
        Animal b = new Chicken(); //upcasting
        b.walk(); //walks on 2 legs

    }
}

// Output:
// You are creating an animal
// You are creating a horse
// You are creating an animal
// You are creating a horse
// walks on 4 legs
// eats food
// You are creating an animal
// walks on 2 legs
// You are creating an animal
// walks on 4 legs
// You are creating an animal
// walks on 2 legs
//
