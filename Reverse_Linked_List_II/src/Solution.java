
//  Definition for singly-linked list.


public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n) return head;
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode last = dummy;
        int cnt = 1;
        while(cnt < m){
            last = last.next;
            cnt++;
        }

        ListNode pre = null;
        ListNode next = last.next;
        ListNode tmpNext = null;
        while (cnt <= n){
            tmpNext = next.next;
            next.next = pre;
            pre = next;
            next = tmpNext;
            cnt++;
        }
        last.next.next = tmpNext;
        last.next = pre;
        return dummy.next;
    }
}