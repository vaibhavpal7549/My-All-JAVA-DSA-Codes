public class constructor {
    public static void main(String[] args) {
        student3 s1 = new student3("Shivika");
        // System.out.println(s1.name);
        
    }
}

class student3 {
    int rollno;
    String name;

    student3(String name){
        System.out.println("This is no-arg constructor");
        // this.name = name;

    }
}
