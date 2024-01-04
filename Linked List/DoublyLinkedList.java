class Node {

  int data;
  Node next;
  Node prev;

  Node(int d) {
    data = d;
    next = null;
    prev = null;
  }
}

public class DoublyLinkedList {

  public static Node arrayToList(int arr[]) {
    Node head = new Node(arr[0]);
    Node temp = head;
    for (int i = 1; i < arr.length; i++) {
      Node x = new Node(arr[i]);
      temp.next = x;
      x.prev = temp;
      temp = temp.next;
    }
    return head;
  }

  public static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  // public static Node inserAtHead()
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };
    Node head = arrayToList(arr);
    printList(head);
  }
}
