public class super1 {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}


class Animal{
    String color;
    Animal(){//constructor
        System.out.println("animal constructor is called");
    }
}


class Horse extends Animal {
    Horse(){
        super.color = "brown";
        // super(); //ye agar nahi likhoge tab bhi by default java ise super banakar call kar dega
        System.out.println("horse constructor is called");
    }
}



