
//JCF Stack Implementation
import java.util.*; //import kar lo
public class StackD {
    
    public static void main(String[] args) {
        // Stack s = new Stack(); //stack ka object bana lo
        //Sabse easy aur sabse best way hai stack ko use karne ka
        //JCF ka stack use kar lo
        //JCF ka stack use karne ke liye import karna padega
        //import java.util.*; //import kar lo
        //JCF ka stack use karne ke liye Stack class ka object bana lo
        Stack<Integer> s = new Stack<>(); //stack ka object bana lo
        s.push(10); //10 ko stack me daal do
        s.push(20); //20 ko stack me daal do
        s.push(30); //30 ko stack me daal do

        while(!s.isEmpty()){ //agar stack empty nahi hai to kya karna hai
            System.out.println(s.peek()); //top element ko dekh lo
            s.pop(); //top element ko remove kar do
        }
    }
}
