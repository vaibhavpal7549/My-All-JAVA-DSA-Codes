public class abstract_class {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang

        
        
        // Creating an object of the abstract class
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
    }
}


abstract class Animal{
    String color;

    Animal(){
        System.out.println("Animal constructor called");
        color = "black";
    }


    //non abstract method
    void eat() {
        System.out.println("Eating...");
    }

    //abstract method
    abstract void walk();
    
}


class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "white";
    }
    void walk(){
        System.out.println("Horse is walking");
    }

}

class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang constructor called");
    }


}



class Chicken extends Animal {
    void changeColor(){
        color = "brown";
    }
    void walk(){
        System.out.println("Chicken is walking");
    }
}