public class Solution {
	public static String addBinary(String a, String b) {
		if (a.length() < b.length()) {
			String tmp = b;
			b = a;
			a = tmp;
		}
		char[] ca = a.toCharArray();
		char[] cb = b.toCharArray();
		char[] cc = new char[ca.length];

		int pa = ca.length - 1;
		int pb = cb.length - 1;
		int carry = 0;
		String rst = "";
		
		while (pb >= 0) {
			int sum = (int)(a.charAt(pa) - '0') + (int)(b.charAt(pb) - '0') + carry;
            rst = String.valueOf(sum % 2) + rst;
            carry = sum / 2;
            pa --;
            pb --;
		}
		
		while(pa >= 0){
            int sum = (int)(a.charAt(pa) - '0') + carry;
            rst = String.valueOf(sum % 2) + rst;
            carry = sum / 2;
            pa --;
        }    

		 if (carry == 1)
	            rst = "1" + rst;
		return rst;
	}

	public static void main(String[] args) {
		System.out.println(addBinary("111", "1"));
	}
}
