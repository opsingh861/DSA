public class OddEvenLinkedList {

  public ListNode oddEvenList(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode even = head.next;
    ListNode evenHead = head.next;
    ListNode odd = head;
    while (even != null && even.next != null) {
      odd.next = odd.next.next;
      even.next = even.next.next;

      odd = odd.next;
      even = even.next;
    }
    odd.next = evenHead;
    return head;
  }
}

class ListNode {

  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}
