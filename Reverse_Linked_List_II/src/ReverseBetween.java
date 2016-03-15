
public class ReverseBetween {
	
	public static ListNode reverseBetween1(ListNode head, int m, int n) {
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
	
	@SuppressWarnings("unused")
	public static ListNode reverseBetween2(ListNode head, int m, int n) {
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

        ListNode head2 = last;
        ListNode pre = head2.next;
        ListNode cur = pre.next;
        while (cnt < n){
        	pre.next = cur.next;
        	cur.next = head2.next;
        	head2.next = cur;
        	cur = pre.next;
            cnt++;
        }
        return dummy.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head =	new ListNode(0);
		ListNode p = head;
		for(int i=1;i<4;i++){
			ListNode temp =	new ListNode(i);
			p.next = temp;
			p = p.next;
		}
		
		p = head.next;
		
		p = reverseBetween2(p, 2, 3);
		while(p!=null){
			System.out.println(p.val);
			p=p.next;
		}
	}

}
