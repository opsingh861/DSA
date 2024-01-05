public class CheckPalindrome {

  public static Node reverse(Node head) {
    if (head == null || head.next == null) {
      return head;
    }

    Node newNode = reverse(head.next);
    Node front = head.next;
    front.next = head;
    head.next = null;
    return newNode;
  }

  public static boolean isPalindrome(Node head) {
    // write your code here
    Node slow = head;
    Node fast = head;
    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    Node newNode = reverse(slow.next);
    Node first = head;
    Node second = newNode;
    while (second != null) {
      if (first.data != second.data) {
        reverse(newNode);
        return false;
      }
      first = first.next;
      second = second.next;
    }
    reverse(newNode);
    return true;
  }
}
  class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }