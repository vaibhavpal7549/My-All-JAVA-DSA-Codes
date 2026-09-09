//Static variable is shared among all instances of a class. It belongs to the class rather than any specific object. In this example, the static variable 'school' is shared by all instances of the 'student' class.

//to static hum un properties ya cheezoan ko banaate hain, jinko hum chaahte haain ki vo common rahe, yaani ki vo har object ke liye same rahe, aur vo har object ke liye alag na ho.
//static ko paanch tareeko se use karte hain:
//1. static variable: static variable is shared among all instances of a class. It belongs to the class rather than any specific object. In this example, the static variable 'school' is shared by all instances of the 'student' class.
//2. static method: static method is a method that belongs to the class rather than any specific object. It can be called without creating an instance of the class. In this example, the static method 'info' is called without creating an instance of the 'Animal' interface.
//3. static block: static block is a block of code that is executed when the class is loaded into memory. It is used to initialize static variables or perform any other static initialization tasks. In this example, the static block is used to initialize the static variable 'school' with a value of "ABC School".
//4. static class: static class is a nested class that is declared as static. It can be accessed without creating an instance of the outer class. In this example, the static class 'Inner' is accessed without creating an instance of the 'Outer' class.
//5. Memory management: Sirf ek baar hi memory allocate hoti hai, aur vo memory har object ke liye same hoti hai, aur vo har object ke liye alag nahi hoti. Aur object ki cheezon ko memory baar baar di jaati hai.
class student {

    String name;
    static String school;

}

public class static1 {

    public static void main(String[] args) {

        student.school = "ABC School";

        student s1 = new student(); //instance of student class
        s1.name = "John";

        student s2 = new student(); //instance of student class
        s2.name = "Alice";

        System.out.println(s1.name + " studies at " + student.school);//
        System.out.println(s2.name + " studies at " + student.school);

    }
}
