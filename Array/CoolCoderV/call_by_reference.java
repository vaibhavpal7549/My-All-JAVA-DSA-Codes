public class call_by_reference {

    public static void update(int marks[]){
        marks[0] = 100;
        marks[1] = 200;
        for(int i = 0; i < marks.length; i++){
            System.out.println("Inside update method: " + marks[i]); 
            // prints 100, 200, 99, 100, 101

        }

        



    }


    public static void main(String[] args) {
        int marks[] = {97, 98, 99, 100, 101};

        System.out.println("Before calling the method: " + marks[0]); // 97
        update(marks);

        System.out.println("After calling the method: " + marks[0]); // 100

        //print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        } // prints 100, 200, 99, 100, 101
    }
}
