
public class StackC {
    //head Node
    static class Node{ //node ka class
        //node ka data aur next node ka reference
        int data;
        Node next; //next node ka reference
        Node(int data){ //constructor
            this.data = data; //data ko set kar do
            this.next = null; //next ko null kar do
        }
    }
    static class Stack {
        static Node head = null; //head node ka reference "Aise mein har koi method access kar sakega" 
        public static boolean isEmpty(){
            return head == null; //agar head null hai to stack empty hai
        }


        //Major Function
        //push operation
        //stack me data daal do
        public static void push(int data){
            Node newNode = new Node(data); //new node create

            if(isEmpty()){ //agar stack empty hai to kya karna hai
                head = newNode; //head ko new node se set kar do
                return; //return kar do
            }

            newNode.next = head;
            head = newNode; //head ko new node se set kar do
        }

        //pop operation
        //stack se data nikal do
        public static int pop(){
            if(isEmpty()){ //agar stack empty hai to kya karna hai
                return -1; //error code
            }
            int top = head.data; //top ko head ka data de do
            head = head.next; //head ko next node se set kar do
            return top; //top ko return kar do
        }

        //peek operation
        //top element ko dekhne ke liye
        //top element ko return kar do bina remove kiye
        public static int peek(){
            if(isEmpty()){ //agar stack empty hai to kya karna hai
                return -1; //error code
            }
            return head.data; //head ka data return kar do
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
