public class Solution {

	public static int reverse(int x) {
		int ans = 0, sign = 1;
		if (x < 0) {
			sign = -1;
			x = sign * x;
		}
		while (x != 0) {
			int b = x % 10;
			if (ans > (Integer.MAX_VALUE - b) / 10) {
				return 0;
			}
			ans = ans * 10 + b;
			x /= 10;
		}
		return ans * sign;
	}

	public static int reverse2(int x) {
		long sum = 0;
		while (x != 0) {
			sum = sum * 10 + x % 10;
			if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)
				return 0;
			x /= 10;
		}
		return (int) sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		System.out.println(reverse(Integer.MAX_VALUE));
		System.out.println(reverse(-123456));
		System.out.println(reverse(123456));
		System.out.println(reverse(0));
		System.out.println(reverse(1000));
		System.out.println(reverse(1000000003));
	}

}
