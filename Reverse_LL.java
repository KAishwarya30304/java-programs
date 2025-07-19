import java.util.*;

class Node {
    int data;
    Node next;
}

class Reverse_LL {
    static Node head = null;

    public static void add_element(int data) {
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public static void reverse_nodes() {
        Node prevNode = null;
        Node currNode = head;
        Node nexNode;

        while (currNode != null) {
            nexNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nexNode;
        }

        head = prevNode; 
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of elements

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            add_element(val);
        }

        System.out.println("Original list:");
        display();

        reverse_nodes();

        System.out.println("Reversed list:");
        display();
    }
}
