public class Solution {

	public static boolean isPalindrome(int x) {
		if(x < 0) return false;
        int reverseX = 0;
        int tmp = x;
        while(tmp != 0){
            reverseX = reverseX * 10 + tmp % 10;
            tmp /= 10;
        }
        return reverseX == x;
	}

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(123321));
		System.out.println(isPalindrome(2147483647));
		System.out.println(isPalindrome(2147483647));
	}

}
