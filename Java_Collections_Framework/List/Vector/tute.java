
import java.util.Vector;


// Vector - Dynamic Array
// package Java.Collection_Framework.Vector;
public class tute {


    public static void main(String[] args) {

        // Vector v = new Vector();
        Vector <Integer> v = new Vector <Integer>();
        v.add(4);
        v.add(7);
        v.add(6);
        v.add(45);
        v.add(6);
        v.add(63);
        v.add(6);
        v.add(67);
        v.add(6);
        v.add(8);
        v.add(6);

        v.remove(1);

        System.out.println(v.capacity());
        System.out.println();

        for(int i : v){
            System.out.println(i);
        }
        
    }
    
}
