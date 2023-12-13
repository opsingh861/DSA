class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    void append(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            // return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    void show() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(0);
        list.append(1);
        list.append(2);
        list.append(3);
        list.show();
    }
}