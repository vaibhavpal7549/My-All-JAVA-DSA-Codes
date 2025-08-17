public class method_overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();

        
    }
    
}

class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Dear is eating");
    }
}
