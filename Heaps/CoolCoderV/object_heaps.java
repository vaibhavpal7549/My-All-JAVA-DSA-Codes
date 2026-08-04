

import java.util.PriorityQueue;

public class object_heaps {

    public static class Student implements Comparable<Student>{ //Comparable is an interface which is used to compare the objects of a class. 
    // It has a method compareTo() which is used to compare the objects of a class.
        //Yahan par Comparable ek object hai
        //here implements Comparable<Student> means that the Student class is implementing the Comparable interface and it is specifying that it will compare objects of type Student.
        //implements keyword is used to implement an interface in Java. It is used to achieve abstraction and multiple inheritance in Java.
        //Comparable interface is inbuilt in java
        //comparable interface ke andar ek function hota hai , jiska naam hai compareto() , jiska kaam hai ki ye do objects ko compare karta hai aur return karta hai ek integer value.

        String name;
        int rank;

        public Student(String name, int rank){ //Constructor
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        //Ascending Order of rank
        PriorityQueue<Student> pq = new PriorityQueue<>();

        //Descending Order of rank
        //PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));
        
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> "+ pq.peek().rank); //O(1)
            pq.remove(); //O(logn)
        }

        //output: C -> 2 A -> 4 B -> 5 D -> 12
    }
}


