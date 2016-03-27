public class Solution {

	public int myAtoi2(String str) {
		if (str == null || str.length() == 0)
			return 0;
		int res = 0, i = 0;
		while (str.charAt(i) == ' ')
			i++;
		int sign = str.charAt(i) == '-' ? -1 : 1;
		if (str.charAt(i) == '-' || str.charAt(i) == '+')
			i++;
		char tmp;
		while (i < str.length() && ((tmp = str.charAt(i)) >= '0' && tmp <= '9')) {
			if (res > 214748364 || (res == 214748364) && tmp > '7')
				return sign == 1 ? 2147483647 : -2147483648;
			res = 10 * res + tmp - '0';
			i++;
		}
		return res * sign;
	}

	public static int myAtoi(String str) {
		str = str.trim();
		int len = str.length();
		if (len == 0)
			return 0;

		int sign = 1, i = 0;
		char tmp = str.charAt(i);
		long res = 0;

		if (tmp == '-') {
			sign = -1;
			i++;
		} else if (tmp == '+')
			i++;

		for (; i < len; i++) {
			tmp = str.charAt(i);
			if (tmp <= '9' && tmp >= '0') {
				res = res * 10 + (tmp - '0') * sign;
				if (res > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				}
				if (res < Integer.MIN_VALUE) {
					return Integer.MIN_VALUE;
				}
			} else
				break;
		}

		return (int) res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi(" -098 kj544530 "));
		System.out.println(myAtoi("-2147483648"));
		System.out.println(myAtoi("9223372036854775809"));

	}

}
