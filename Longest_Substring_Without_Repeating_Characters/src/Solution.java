public class Solution {
	public int lengthOfLongestSubstring2(String s) {
		int maxLen = 0;
		int currentLen = 0;
		int start = 0;
		int hash[] = new int[256];
		for (int i = 0; i < s.length(); i++) {
			int lastPost = hash[s.charAt(i)];
			if (lastPost == 0) {
				currentLen++;
			} else {
				for (int j = start; j < lastPost; j++)
					hash[s.charAt(j)] = 0;
				start = lastPost;
				currentLen = i - start + 1;
			}
			hash[s.charAt(i)] = i + 1;
			if (maxLen < currentLen)
				maxLen = currentLen;
		}
		return maxLen;
	}

	public int lengthOfLongestSubstring(String s) {
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
