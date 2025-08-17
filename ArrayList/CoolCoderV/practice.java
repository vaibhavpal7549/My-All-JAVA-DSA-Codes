import java.util.ArrayList;
import java.util.Collections;
public class practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //performing list add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //performing of adding element at a specific index
        list.add(1, 9); //O(n)

        System.out.println(list);

        //Performing get operation
        int element = list.get(2);
        System.out.println(element);

        //performing remove operation
        list.remove(2);
        System.out.println(list);

        //performing set element at index
        list.set(2, 10);
        System.out.println(list);

        //performing contains element
        System.out.println(list.contains(5)); //true
        System.out.println(list.contains(1)); //true
        System.out.println(list.contains(55)); //false

        //performing size of ArrayList
        int size = list.size();
        System.out.println(size);

        //iterating over arraylist
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("Sorted ArrayList in ascending order");

        //ascending order
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Descending order");

        //descending order
        Collections.sort(list, Collections.reverseOrder());
        //comparator - fnx logic
        System.out.println(list);


    }
}
