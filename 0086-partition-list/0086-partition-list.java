/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = null;
        ListNode smallTail = null;
        ListNode largeHead = null;
        ListNode largeTail = null;

        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = null;

            if (curr.val < x) {
                if (smallHead == null) {
                    smallHead = curr;
                    smallTail = curr;
                } else {
                    smallTail.next = curr;
                    smallTail = curr;
                }
            } else {
                if (largeHead == null) {
                    largeHead = curr;
                    largeTail = curr;
                } else {
                    largeTail.next = curr;
                    largeTail = curr;
                }
            }

            curr = next;
        }

        if (smallHead == null)
            return largeHead;

        smallTail.next = largeHead;
        return smallHead;
    }
}