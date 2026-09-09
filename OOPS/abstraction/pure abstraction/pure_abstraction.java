//pure abstraction is a process of hiding the implementation details and showing only functionality to the user.

//interfaces ke constructors nahi hote, isliye hum interface ka object nahi bana sakte, aur interface ke andar koi bhi method ka body nahi hota, isliye hum interface ke andar koi bhi method ko implement nahi kar sakte.
// interface ke andar koi bhi non abstract method nahi hota, isliye hum interface ke andar koi bhi method ko implement nahi kar sakte.
//interfaces ko java ke andar hum implements karte hain, aur abstract class ko java ke andar hum extends karte hain
//jitne bhi methods ko hum interface ke andar define karte hain, unko hum implement karte hain derived class ke andar, aur agar hum derived class ke andar unko implement nahi karte hain, to derived class ko bhi abstract banana padta hai
// Lekin interface mein default aur static methods body ke saath ho sakte hain:
interface Animal {

    //yahan par sirf eat function ko defines kiya hai, aur uska implementation humne Horse class ke andar kiya hai
    void eat(); //by default public and abstract
    int eyes = 2; //by default public, static and final

    public void run(); //by default public and abstract

    void walk(); //by default public and abstract

    //Lekin interface mein default aur static methods body ke saath ho sakte hain:
    default void sleep() {
        System.out.println("Sleeping");
    }

    //Lekin interface mein default aur static methods body ke saath ho sakte hain:
    static void info() {
        System.out.println("Animal interface");
    }
}

interface Herbivore {

}

class Horse implements Animal, Herbivore {

    public void eat() {
        System.out.println("eats food");
    }

    public void walk() {
        System.out.println("walks on 4 legs");
    }

    public void run() {
        System.out.println("runs fast");
    }
}

public class pure_abstraction {

    public static void main(String[] args) {

        Horse h = new Horse();
        h.walk(); //walks on 4 legs
        h.eat(); //eats food

    }

}
