public class Solution {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode p = head;
		while(l1!=null && l2!=null){
			if(l2.val<l1.val){
				p.next = l2;
				l2 = l2.next;
			}else{
				p.next = l1;
				l1 = l1.next;
			}
			p = p.next;
		}
		
		p.next = l1 == null ? l2:l1;
		
		return head.next;
	}

	public static void main(String[] args) {
		ListNode head1 = new ListNode(0);
		ListNode p1 = head1;
		ListNode head2 = new ListNode(0);
		ListNode p2 = head2;
		
		for (int i = 1; i < 4; i++) {
			ListNode temp = new ListNode(i);
			p1.next = temp;
			p1 = p1.next;
		}
		for (int i = 3; i < 7; i++) {
			ListNode temp = new ListNode(i);
			p2.next = temp;
			p2 = p2.next;
		}
		
		ListNode p = mergeTwoLists(head1.next,head2.next);
		while (p != null) {
			System.out.println(p.val);
			p = p.next;
		}
	}
}
