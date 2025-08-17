



public class hierarchial {
    public static void main(String[] args) {
        // Create an object of the subclass
        Bird dobby = new Bird();
        dobby.eat();
    }
}




//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eating");
    }

    void breathe(){
        System.out.println("Breathing");
    }

}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walking");
    }


}

class Fish extends Animal{
    void swim(){
        System.out.println("Swimming");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flying");
    }
}


