public class Solution {
	
	public static int lengthOfLastWord(String s) {
		char[] ca = s.toCharArray();
		
		int len = ca.length, i = len-1;
		while(i>-1 && ca[i] == ' ')
			i--;
		if (i < 0)
			return 0;
		
		int count = 0;
		while (i> -1 && ca[i] != ' ') {
			count++;
			i--;
		}
		return count;
	}
	
	public static int lengthOfLastWord2(String s) {
        s = s.trim(); //效率低于自己动手
		char[] ca = s.toCharArray();

		int i = ca.length-1;
		int count = 0;
		while (i> -1 && ca[i] != ' ') {
			count++;
			i--;
		}
		return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String s = "hello world";
		String s = " ";
		System.out.println(lengthOfLastWord(s));
	}

}
