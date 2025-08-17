

public class multi_level_inheritance {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
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
    int legs;


}
class Dog extends Mammal{
    int tail;
    String breed;
}


