public class linkedList {

    public static void main(String[] args) {
        Node head = null;
        for (int i = 0; i < 10; i++) {
            head = insert(head, i);
        }

        printList(head);
    }

    static void printList(Node head){
        Node ptr= head;

        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            return head;
        }
    }

}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}