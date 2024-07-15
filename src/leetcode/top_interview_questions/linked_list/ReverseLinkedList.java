package leetcode.top_interview_questions.linked_list;

public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
      if (head == null) {
          return null;
      }
    ListNode newNode = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = newNode;
      newNode = head;
      head = next;
    }
    return newNode;
  }
}
