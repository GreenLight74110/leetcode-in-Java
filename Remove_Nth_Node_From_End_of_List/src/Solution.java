public class Solution {

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p = head;
		int cnt = 0, oder = 0;

		while (p != null) {
			p = p.next;
			cnt++;
		}

		p = head;
		oder = cnt - n;
		if (oder <= 0)
			head = p.next;
		else {
			for (int i = 1; i < oder; ++i) {
				p = p.next;
			}
			p.next = p.next.next;
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(0);
		ListNode p = head;
		for (int i = 1; i < 3; i++) {
			ListNode temp = new ListNode(i);
			p.next = temp;
			p = p.next;
		}

		p = removeNthFromEnd(head.next, 2);

		while (p != null) {
			System.out.println(p.val);
			p = p.next;
		}
	}

}
