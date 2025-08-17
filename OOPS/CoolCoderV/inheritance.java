public class inheritance {
    public static void main(String[] args) {
        // Create an object of the subclass
        Fish shark = new Fish();
        shark.eat(); // Output: Fish is eating
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

//derived class
class Fish extends Animal {
    void swim(){
        System.out.println("Swimming");
    }
}
