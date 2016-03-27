public class Solution {

	public static int[] plusOne(int[] digits) {

		if (digits.length == 0) {
			int[] none = { 1 };
			return none;
		}

		int i = digits.length - 1;

		if (digits[i] < 9) {
			digits[i]++;
			return digits;
		}

		int tmp = 0;
		boolean flag = false;
		while (i >= 0) {
			tmp = digits[i] + 1;
			if (tmp > 9) {
				if (i == 0)
					flag = true;
				digits[i] = tmp % 10;
				i--;
			} else {
				digits[i] = tmp;
				break;
			}
		}

		if (flag) {
			i = digits.length;
			int[] newDigits = new int[i + 1];
			while (i > 0) {
				newDigits[i] = digits[i - 1];
				i--;
			}
			newDigits[0] = 1;
			return newDigits;
		}

		return digits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {9};
		// int i = 0;
		// while(i>0){
		// digits[i] = digits[i-1];
		// }
		// digits[0] = 1;

		digits = plusOne(digits);
		for (int j : digits) {
			System.out.println(j);
		}
	}

}
