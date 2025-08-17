public class linkedlist {

    //Node Class
    public static class Node{
        int data;
        Node next;

        //constructor 
        public Node(int data){ //as a parameter aaya hai data
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    //Methods
    //these are operatios
    // add()
    // remove()
    // print()
    // search()

    //add operation
    public void addFirst(int data){

        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step2  newNode next = head
        newNode.next = head; //linking step

        //step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data){
        //step1 - create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        //step2 - newNode next = tail.next
        // newNode.next = tail.next;
        //step3 - tail.next = newNode
        tail.next = newNode;
        //step4 - tail = newNode
        tail = newNode;

    }
    public void add(int idx, int data){
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i<idx-1){
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp ->
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print(){ //printing linked list //O(n)
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");


    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("List is empty");
            // return -1;
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val; 

        }


        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("List is empty");
            // return -1;
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev: i = size - 2;
        Node prev = head;
        for(int i = 0; i<size - 2; i++){
            prev = prev.next;

        }
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int itrSearch(int key){ //O(n)
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){ //key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        //key not found
        return -1;
    }
    public static void main(String[] args) {
        //Node Creation in main function
        //same linkedlist class se ek object hai ll naam se
        // aur isi obj ke andar saare nodes create honge
        linkedlist ll = new linkedlist();


        // ll.head = new Node(1);
        // ll.head.next  = new Node(2);


        // ll.print();
        // ll.addFirst(2); //O(1)
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);
        // ll.print();

        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.add(2,9);


        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);

        ll.print(); //1->2->3->4->5
        // System.out.println(ll.size);
        System.out.println(ll.removeFirst());
        ll.print(); //2->3->4->5

        System.out.println(ll.removeLast());
        ll.print(); //2->3->4
        System.out.println(ll.size);

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
        
    }
}
