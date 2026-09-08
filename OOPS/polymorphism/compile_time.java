
class Student {

    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(this.name);

    }

    public void printInfo(int age) {
        System.out.println(this.age);
    }

    public void printInfo(String name, int age) {
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

public class compile_time {

    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 22;

        s1.printInfo(s1.name, s1.age); //aman 22
    }
}

//java ke andar automatic garbage collector hota hai, jiski wajah se destructure hamein nahi banaana padta hai
//universe mein balance hota hai
//jo obj , variable use nahi ho raha hai use yeautomatic garbage mein daal deta hai
//isliye java efficient hota hai
// Polymorphism
//2 types
// Compile time polymorphism // function over loading

