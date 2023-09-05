package leetcode.top_interview_questions.linked_list;

public class RemoveNthNodeFromEndList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode a = newNode;
        ListNode b = newNode;
        while(n>0){
            b = b.next;
            n--;
        }
        while(b.next != null){
            b = b.next;
            a = a.next;
        }
        a.next = a.next.next;
        return newNode.next;
    }
}
