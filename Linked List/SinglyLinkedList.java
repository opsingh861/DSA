class Node {

  int val = 0;
  Node next = null;

  Node() {
    this.val = 0;
    this.next = null;
  }

  Node(int val) {
    this.val = val;
  }

  Node(int val, Node next) {
    this.val = val;
    this.next = next;
  }
}

public class SinglyLinkedList {

  static Node arrayToLinkedList(int arr[]) {
    Node head = new Node(arr[0]);
    Node temp = head;
    for (int i = 1; i < arr.length; i++) {
      Node x = new Node(arr[i]);
      temp.next = x;
      temp = temp.next;
    }
    return head;
  }

  static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
  }

  public static Node insertNodeByPosition(Node head, int val, int k) { // this is used for inserting node at given position
    if (head == null) {
      if (k == 1) {
        Node node = new Node(val);
        return node;
      } else {
        return head;
      }
    }
    if (k == 1) {
      Node x = new Node(val);
      x.next = head;
      return x;
    }

    Node temp = head;
    int count = 0;
    while (temp != null) {
      count++;
      if (count == k - 1) {
        Node x = new Node(val);
        x.next = temp.next;
        temp.next = x;
        break;
      }
      temp = temp.next;
    }
    return head;
  }

  public static Node insertNodeByData(Node head, int val, int data) { // we use this to insert node before the given data
    if (head == null) {
      return null;
    }
    if (head.val == data) {
      Node x = new Node(val);
      x.next = head;
      return x;
    }

    Node temp = head;
    while (temp.next != null) { // for the worst cast which is the tail bcz after tail there will be no element to check
      if (temp.next.val == data) {
        Node x = new Node(val);
        x.next = temp.next;
        temp.next = x;
        break; // we need to break bcz that element will be always present there so loop will run upto infinit
      }
      temp = temp.next;
    }
    return head;
  }

  public static Node deleteNodeByPosition(Node head, int k) {
    if (head == null) {
      return null;
    }
    if (k == 1) {
      head = head.next;
      return head;
    }
    int count = 1;
    Node temp = head;
    while (temp.next != null) {
      if (k - 1 == count) {
        temp.next = temp.next.next;
        break;
      }
      count++;
      temp = temp.next;
    }
    return head;
  }

  public static Node deleteNodeByData(Node head, int data) {
    if (head == null) {
      return null;
    }
    if (head.val == data) {
      head = head.next;
      return head;
    }
    // int count = 1;
    Node temp = head;
    while (temp.next != null) {
      if (temp.next.val == data) {
        temp.next = temp.next.next;
        break;
      }
      temp = temp.next;
    }
    return head;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };

    Node head = arrayToLinkedList(arr);
    // Node newNode1 = insertNodeByPosition(head, 100, 8);
    // Node newNode2 = insertNodeByData(head, 100, 3);
    // head = deleteNodeByPosition(head, 4);
    head = deleteNodeByData(head, 5);
    printList(head);
  }
}
