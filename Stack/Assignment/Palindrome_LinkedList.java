//Palindrome Linked List
// We have a singly linked list of characters, write a function that returns true if the given list is a
// palindrome, else false.

//Time Complexity
// O(n) where n is the number of nodes in the linked list.
//Space Complexity
// O(n) for the space required to store the characters in the list.
import java.util.*;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Palindrome_LinkedList {

    public static boolean isPalindrome(Node head){
        // First, we need to store the characters in the linked list in a list.
        Node slow = head;
        boolean ispalin = true;
        Stack<Integer> s = new Stack<Integer>();
        while(slow != null){
            s.push(slow.data);
            slow = slow.next;
        }
        // Now, we need to compare the characters from the start and end of the list.
        while(head != null){
            int i = s.pop();
            if(head.data !=i){
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
        
    }
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        System.out.println(isPalindrome(one)); // prints: true
    }
    
}
