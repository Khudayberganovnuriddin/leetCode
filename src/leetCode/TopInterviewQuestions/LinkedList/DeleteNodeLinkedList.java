package leetCode.TopInterviewQuestions.LinkedList;

public class DeleteNodeLinkedList {
    public void deleteNode(ListNode node) {
        if(node.next == null || node == null)
            return;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
