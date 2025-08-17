

public class non_parameterized {
    public static void main(String[] args) {
        student3 s1 = new student3();
        // System.out.println(s1.name);
        student3 s2 = new student3("Shivika");
        student3 s3 = new student3(20);
        student3 s4 = new student3("Shivika", 20);
        
    }
}

class student3 {
    int rollno;
    String name;

    //non parameterized constructors
    student3() {
        System.out.println("Constructor is called: ");
    }

    // parameterized constructors
    student3(String name){
        this.name = name;
    }

    //parameterized constructors
    student3(int roll){
        this.rollno = roll;
    }

    //parameterized constructors
    student3(String name, int rollno) {
        this.rollno = rollno;
        this.name = name;
    }


    
}
