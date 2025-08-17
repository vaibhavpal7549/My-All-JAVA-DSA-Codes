


public class shallow_deepcopy {
    public static void main(String[] args) {
        student3 s1 = new student3();
        s1.name = "Vaibhav";
        s1.rollno = 1;
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        student3 s2 = new student3(s1); //Copy
        s2.password = "xyz";
        s1.marks[2] = 100;

        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }


        
    }
}

class student3 {
    int rollno;
    String name;
    String password;
    int marks[];

    class Address{
        String street;
    }


    //Shallow copy constructor
    // student3(student3 s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
    //     this.marks = s1.marks;
    // }

    //Deep copy constructor
    student3(student3 s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.password = s1.password;
        for(int i = 0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }

    }



    

    //non parameterized constructors
    student3() {
        marks = new int[3];
        System.out.println("Constructor is called: ");
    }

    // parameterized constructors
    student3(String name){
        marks = new int[3];
        this.name = name;
    }

    //parameterized constructors
    student3(int roll){
        marks = new int[3];
        this.rollno = roll;
    }

    //parameterized constructors
    student3(String name, int rollno) {
        marks = new int[3];
        this.rollno = rollno;
        this.name = name;
    }


}
