package leetCode.DailyChallenges.easy_challenges;

import leetCode.TopInterviewQuestions.LinkedList.ListNode;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }
}
