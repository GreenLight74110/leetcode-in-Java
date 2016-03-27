public class Add2Num {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int carry = 0;

		ListNode p = new ListNode(0);
		ListNode head = p;
		
		while(l1 != null||l2 != null){
			if(l1!=null){
				carry += l1.val;
				l1 = l1.next;
			}
			if(l2!=null){
				carry += l2.val;
				l2 = l2.next;
			}
			
			p.next = new ListNode(carry%10);
			p = p.next;
			carry /= 10;
		}
		if (carry > 0) {
			p.next = new ListNode(carry);;
		}
		return head.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = { 1, 8 };
		int[] a2 = { 0 };

		ListNode head1 = new ListNode(0);
		ListNode p1 = head1;
		ListNode head2 = new ListNode(0);
		ListNode p2 = head2;
		for (int i = 0; i < a1.length; i++) {
			ListNode temp = new ListNode(a1[i]);
			p1.next = temp;
			p1 = p1.next;
		}
		for (int i = 0; i < a2.length; i++) {
			ListNode temp2 = new ListNode(a2[i]);
			p2.next = temp2;
			p2 = p2.next;
		}

		p1 = head1.next;
		p2 = head2.next;

		System.out.println("-------arry1---------");
		while (p1 != null) {
			System.out.println(p1.val);
			p1 = p1.next;
		}
		System.out.println("-------arry2---------");
		while (p2 != null) {
			System.out.println(p2.val);
			p2 = p2.next;
		}

		p1 = addTwoNumbers(head1.next, head2.next);

		System.out.println("-------result---------");
		while (p1 != null) {
			System.out.println(p1.val);
			p1 = p1.next;
		}
	}
}
