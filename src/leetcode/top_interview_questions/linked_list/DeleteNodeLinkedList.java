package leetcode.top_interview_questions.linked_list;

public class DeleteNodeLinkedList {
    public void deleteNode(ListNode node) {
        if(node.next == null || node == null)
            return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
