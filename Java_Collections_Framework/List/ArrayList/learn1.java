// package Java.Java_Collections_Framework.List.ArrayList;

// import java.util.ArrayList;
// public class learn1 {
//     public static void main(String[] args) {
//         ArrayList<String> Name = new ArrayList<String>();
//         Name.add("Vaibhav");
//         Name.add("Shivika");
//         Name.add("Radhika");
        
//         System.out.println(Name);
//         Name.add("Mohan");
//         System.out.println(Name);
//         Name.add(1, "Shyam");
//         System.out.println(Name);
//         Name.remove(0);
//         System.out.println(Name);
//         Name.set(0, "Vaibhavi");
//         String pm = Name.get(3);
//         System.out.println(pm);
//         System.out.println(Name);
//     }
    
// }



import java.util.ArrayList;
import java.util.Collections;


class learn1 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();
    
       //add elements
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);


        //to get an element
        int element = list.get(0); // 0 is the index
        System.out.println(element);


        //add element in between
        list.add(1,2); // 1 is the index and 2 is the element to be added
        System.out.println(list);


       //set element

        list.set(0,0);
        System.out.println(list);


        //delete elements
        list.remove(0); // 0 is the index
        System.out.println(list);


        //size of list
        int size = list.size();
        System.out.println(size);


        //Loops on lists
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        //Sorting the list
        list.add(0);
        Collections.sort(list);
        System.out.println(list);
    }
}

