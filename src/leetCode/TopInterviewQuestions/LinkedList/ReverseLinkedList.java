package leetCode.TopInterviewQuestions.LinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode newNode = null;
        while(head != null){
            ListNode next = head.next;
            head.next = newNode;
            newNode = head;
            head = next;
        }
        return newNode;
    }
}
