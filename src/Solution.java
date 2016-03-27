public class Solution {
	public static ListNode swapPairs(ListNode head) {
		ListNode p, q, last, dummy;
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		dummy = new ListNode(0);
		dummy.next = head;
		last = dummy;
		p = head;
		q = p.next;

		while (q != null) {
			p.next = q.next;
			last.next = q;
			q.next = p;
			last = p;
			p = last.next;
			if (p == null)
				break;
			q = p.next;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(0);
		ListNode p = head;
		for (int i = 1; i <= 28; i++) {
			ListNode temp = new ListNode(i);
			p.next = temp;
			p = p.next;
		}

		p = swapPairs(head.next);
		while (p != null) {
			System.out.println(p.val);
			p = p.next;
		}
	}

}
