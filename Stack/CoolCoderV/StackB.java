import java.util.ArrayList;
public class StackB {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>(); //isko yahin par initialise kar lete hain hum
        public static boolean isEmpty(){
            return list.size() == 0; //size 0 hai to empty hai
        }
        //Major Function
        //push operation
        public static void push(int data){
            list.add(data); //list ke end me data add kar do
        }


        //pop operation
        //last element ko remove kar do aur return bhi kar do
        //last element ko remove karne ke liye list.remove(list.size() - 1) use karte hain
        //last element ko return karne ke liye list.get(list.size() - 1) use karte hain
        //pop operation ko isEmpty() se check karna padega ki stack empty hai ya nahi
        //agar stack empty hai to pop nahi kar sakte
        //agar stack empty nahi hai to pop kar sakte hain
        public static int pop(){
            if(isEmpty()){ //agar stack empty hai to kya karna hai
                return -1; //error code
            }
            int top = list.get(list.size() - 1); //last element ko top me store kar lo
            list.remove(list.size() - 1); //last element ko remove kar do
            return top; //top ko return kar do
        }


        //peek operation
        //top element ko dekhne ke liye
        //top element ko return kar do bina remove kiye

        public static int peek(){
            if(isEmpty()){ //agar stack empty hai to kya karna hai
                return -1; //error code
            }
            return list.get(list.size() - 1); //last element ko return kar do
        }

        //size operation
        //stack ki size ko dekhne ke liye
        //stack ki size ko return kar do
        public static int size(){
            return list.size(); //size ko return kar do
        }
        //print operation
        //stack ko print karne ke liye
        //stack ko print kar do
        public static void print(){
            for(int i = 0; i < list.size(); i++){
                System.out.print(list.get(i) + " "); //list ke elements ko print kar do
            }
            System.out.println(); //new line de do
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack(); //stack ka object bana lo
        s.push(10); //10 ko stack me daal do
        s.push(20); //20 ko stack me daal do
        s.push(30); //30 ko stack me daal do

        while(!s.isEmpty()){ //agar stack empty nahi hai to kya karna hai
            System.out.println(s.peek()); //top element ko dekh lo
            // s.print(); //stack ko print kar do
            s.pop(); //top element ko remove kar do
        }
    }
}
