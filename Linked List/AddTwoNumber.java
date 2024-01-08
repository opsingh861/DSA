public class AddTwoNumber {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode t1 = l1;
    ListNode t2 = l2;
    ListNode r = new ListNode(0);
    ListNode rt = r;
    int carry = 0;
    while (t1 != null || t2 != null || carry == 1) {
      int sum = 0;
      if (t1 != null) {
        sum += t1.val;
        t1 = t1.next;
      }
      if (t2 != null) {
        sum += t2.val;
        t2 = t2.next;
      }
      sum += carry;
      carry = sum / 10;
      rt.next = new ListNode(sum % 10);
      rt = rt.next;
    }

    return r.next;
  }
}
