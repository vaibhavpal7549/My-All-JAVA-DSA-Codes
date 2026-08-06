

import java.util.*;

class Node {

    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class NodeComparator implements Comparator<Node> {

    public int compare(Node k1, Node k2) {

        if (k1.data > k2.data)
            return 1;
        else if (k1.data < k2.data)
            return -1;

        return 0;
    }
}

public class merge_k_sorted_linkedLists {

    static Node mergeKList(Node[] arr, int K) {

        PriorityQueue<Node> queue = new PriorityQueue<>(new NodeComparator());

        Node head = new Node(0);
        Node last = head;

        for (int i = 0; i < K; i++) {
            if (arr[i] != null) {
                queue.add(arr[i]);
            }
        }

        if (queue.isEmpty())
            return null;

        while (!queue.isEmpty()) {

            Node curr = queue.poll();

            last.next = curr;
            last = last.next;

            if (curr.next != null) {
                queue.add(curr.next);
            }
        }

        return head.next;
    }

    static void printList(Node node) {

        while (node != null) {
            System.out.print(node.data);

            if (node.next != null) {
                System.out.print(" -> ");
            }

            node = node.next;
        }

        System.out.println(" -> NULL");
    }

    public static void main(String[] args) {

        int K = 3;

        Node[] arr = new Node[K];

        Node head1 = new Node(1);
        arr[0] = head1;
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(7);

        Node head2 = new Node(2);
        arr[1] = head2;
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);

        Node head3 = new Node(0);
        arr[2] = head3;
        head3.next = new Node(9);
        head3.next.next = new Node(10);
        head3.next.next.next = new Node(11);

        System.out.println("Linked List 1:");
        printList(arr[0]);

        System.out.println("Linked List 2:");
        printList(arr[1]);

        System.out.println("Linked List 3:");
        printList(arr[2]);

        Node res = mergeKList(arr, K);

        System.out.println("\nMerged Linked List:");
        printList(res);
    }
}