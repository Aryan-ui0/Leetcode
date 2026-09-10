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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int count = 1;
        ListNode last = head;
        while(last.next!=null){
            count++;
            last = last.next;
        }
        k = k%count;
        last.next = head;
        ListNode mainhead = head;
        ListNode temp2 = head;
        for(int i =1;i<count-k;i++){
            temp2 = temp2.next;
        }
        head = temp2.next;
        temp2.next = null;
        return head;
    }
}