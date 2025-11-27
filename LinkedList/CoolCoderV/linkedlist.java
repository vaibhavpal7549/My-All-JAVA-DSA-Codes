public class linkedlist {

    //Node Class
    public static class Node{
        int data;
        Node next;

        //constructor 
        //initialise karna hai yahan par
        public Node(int data){ //as a parameter aaya hai data
            this.data = data;
            this.next = null;

        }
    }

    public static Node head; //as a property defined hai
    public static Node tail; //as a property defined hai
    public static int size; //java initialise its size as 0


    //Methods
    //these are operations
    // add()
    // remove()
    // print()
    // search()

    //add operation
    // yahan par static likhne ki zarurat nahi hai kyuki yeh class ke andar hai aur static hai 
    // toh yeh class ke andar ke static variables ko access kar sakte hain
    //kyuki static main function ke andar hai
    // addFirst
    //to hum non static waale ko bhi use kar sakte hain yahan par
    //yeh static waale main function ke andar hai
    public void addFirst(int data){

        //These are the steps for when there is more than 1
        //node in the linked list

        //step1 = create new node
        //class ka naam , object ka naam, new keyword, class ka naam, constructor mein  paas kar diya apna data

        Node newNode = new Node(data);
        size++;

        // assume when linkedlist is empty
        //this is the base case for returning the statement
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step2  newNode next = head
        newNode.next = head; //linking step

        //step3 - head = newNode
        head = newNode;
    }
    //addLast
    public void addLast(int data){//single parameter aaya hai jo ki hai sirf data

        //step1 - create new node
        Node newNode = new Node(data);
        size++;
        //base case
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 - newNode next = tail.next
        // newNode.next = tail.next;
        //step3 - tail.next = newNode
        tail.next = newNode;
        //step4 - tail = newNode
        tail = newNode;

    }
    //method for adding at any index in linked list
    //add in the middle
    //O(N) linear time mein hota hai ye operation
    // dekho yahan par ye linkage karne ke liye hume traverse karna padega
    //toh yahan par constant time operation hoga
    //but yahan par add in the middle O(N) time complexity hai
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

        //i = idx-1; temp -> previous node
        newNode.next = temp.next;
        temp.next = newNode;
    }
    //printing linked list
    public void print(){ //printing linked list //O(n)
        if(head == null){//base case , agar hum isko hata de to null print hoga yahan par
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

    //removeFirst operation in linked list
    //O(1) time complexity
    //head ko change kar dena hai
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

    //removeLast operation in linked list
    //O(n) time complexity
    //Last Node ko remove karne ke liye hume traverse karna padega
    public int removeLast(){ //iske andar koi bhi parameter nahi aaega
        if(size == 0){
            System.out.println("List is empty");
            // return -1;
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = tail.data = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev: i = size - 2 = second last;
        //basic idea is to reach the second last node
        //and then remove the last node
        Node prev = head;
        for(int i = 0; i<size - 2; i++){
            prev = prev.next;

        }
        int val = prev.next.data; //tail.data
        //int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
    //search operation in linked list
    //O(n) time complexity
    //iterative search
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

    //helper function for recursive search
    public int helper(Node head, int key){
        if(head == null){ //base case
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int res = helper(head.next, key);
        if(res == -1){
            return -1;
        }
        return res + 1;

    }


    //recursive search
    public int recSearch(int key){ //O(n)
        return helper(head, key);
    }

    //reverse linked list
    //O(n) time complexity
    public void reverse(){ //O(n)
        Node prev = null;
        Node curr = tail = head;
        // Node next = null;
        Node next;
        // 3 variables and 4 steps
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){//O(n)
        //calculate size of linked list
        int sz = 0;
        Node temp = head;
        while(temp != null){ //O(n) for both Time & Space
            temp = temp.next;
            sz++;
        }
    
        if(n == sz){
            head = head.next; // HEAD BAN JAAEGA HEAD KA NEXT //removeFirst
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        
    }

    //find mid of linked list
    //O(n) time complexity
    //O(1) space complexity
    //slow and fast pointer Approach
    //helper function
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next; //1 step
            fast = fast.next.next; //2 steps
        }
        return slow;
    }

    public boolean checkPalindrome(){ //O(n)
        if(head == null || head.next == null){
            return true;
        }
        //Step1 - find mid
        Node midNode = findMid(head);

        //Step2 - reverse the second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //prev is the new head of the second half
        Node right = prev; //second half head
        Node left = head; //first half head

        //Step3 - compare first half and second half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    //detect cycle in linked list
    //O(n) time complexity
    //O(1) space complexity
    //Floayd's Cycle Detection Algorithm
    public static boolean isCycle(Node head){//O(n)
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //1 step
            fast = fast.next.next; //2 steps
            if(slow == fast){
                return true; //cycle found
            }
        }
        return false; //no cycle
    }

    //remove cycle in linked list
    //O(n) time complexity
    //O(1) space complexity
    //Floyd's Cycle Detection Algorithm
    //and remove cycle
    //toh yahan par hum cycle ko remove karne ke liye yeh karenge ki
    //cycle ke sabhi nodes ko ek dusre se disconnect karenge
    //and then we will set the next of the last node to null
    public static void removeCycle(Node head){
        //check if cycle exists // Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next; //1 step
            fast = fast.next.next; //2 steps
            if(slow == fast){
                cycle = true; //cycle found
                break;
            }
        }
        if(cycle == false){
            return; //no cycle
        }

        //find the start of the cycle //find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;     
            slow = slow.next; //1 step
            fast = fast.next; //1 step
        }
        //slow is the start of the cycle
        prev.next = null; //remove cycle
    }

    //main function
    public static void main(String[] args) {
        //Node Creation in main function
        //same linkedlist class se ek object hai ll naam se
        // aur isi obj ke andar saare nodes create honge
        // linkedlist ll = new linkedlist();


        // ll.head = new Node(1); //1 as a data stored hai
        // ll.head.next  = new Node(2); //2 as a data stored hai


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


        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2,3);

        // ll.print(); //1->2->3->4->5
        // System.out.println(ll.size);
        // System.out.println(ll.removeFirst());
        // ll.print(); //2->3->4->5

        // System.out.println(ll.removeLast());
        // ll.print(); //2->3->4
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));

        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));

        // ll.reverse();
        // ll.print();
        // ll.deleteNthfromEnd(3);
        // ll.print();
        // System.out.println(ll.checkPalindrome());
        // ll.print();

        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;
        //1->2->3->1


        // System.out.println(isCycle(head));//true

        
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1->2->3->2
        System.out.println(isCycle(head));//true
        removeCycle(head);
        //1->2->3->null
        System.out.println(isCycle(head));//false

        //1->2->3->null
        
    }
}


