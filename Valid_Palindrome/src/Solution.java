public class Solution {
	public static boolean isPalindrome(String s) {
		char[] ca = s.toCharArray();
		int left = 0, right = ca.length - 1;
		while (left <= right) {
			if (122 < ca[left] || ca[left] < 97) {
				if ((64 < ca[left] && ca[left] < 91))
					ca[left] += 32;
				else if(57 < ca[left] || ca[left] < 48){
					left++;
					continue;
				}
			}
			
			if (122 < ca[right] || ca[right] < 97) {
				if ((64 < ca[right] && ca[right] < 91))
					ca[right] += 32;
				else if(57 < ca[right] || ca[right] < 48){
					right--;
					continue;
				}
			}

			if (ca[left++] != ca[right--]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(""));
	}

}
