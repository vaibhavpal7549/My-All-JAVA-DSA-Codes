public class FirstClass{
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        System.out.println(h.color);

        // Animal a = new Animal(); //ye error aaega qki hum abstract ki class nahi create kar sakte hain
        //Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang
    }
}

//abstract classes
//abstract classes vo classes hoti hain jinke andar object nahi bana sakte hain
//base class
abstract class Animal{
    String color;
    Animal(){// ye ek constructor hai
        // color = "brown";
        System.out.println("Animal constructor called");
    }

    //non abstact methods
    void eat(){
        System.out.println("animal eats");
    }

    //abstract methods
    //ye ek idea de deta haix
    //iske andar implementation nahi likhte hain
    abstract void walk();// walk ka koi bhi implementation nahi hai
    

}

//subclasses
class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called");
    }

    void changeColor(){
        color = "dark brown";
    }

    //horse ke liye walk() method mand. ho gaya hia ab
    void walk(){
        System.out.println("walks on four legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}



