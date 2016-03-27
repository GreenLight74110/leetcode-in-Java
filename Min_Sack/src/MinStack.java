class ListNode {
	int val;
	ListNode next;
	int min;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class MinStack {
    ListNode top = null;
	ListNode tmp;

	public void push(int x) {
		if (top == null) {
			top = new ListNode(x);
			top.min = x;
		} else {
			tmp = new ListNode(x);
			tmp.next = top;
			top = tmp;
			top.min = top.min < x ? top.min : x;
		}
	}

	public void pop() {
		if (top != null) {
			top = top.next;
		}
	}

	public int top() {
		return top == null ? 0 : top.val;

	}

	public int getMin() {
		return top == null ? 0 : top.min;
	}
	
	public static void main(String[] args) {
		MinStack mstack = new MinStack();
		mstack.push(2);
		mstack.push(1);
		mstack.push(3);
		mstack.push(0);
		
		System.out.println(mstack.getMin());
		mstack.pop();
		System.out.println(mstack.getMin());
		mstack.pop();
		System.out.println(mstack.getMin());
		mstack.pop();
		System.out.println(mstack.getMin());
		
	}
}  