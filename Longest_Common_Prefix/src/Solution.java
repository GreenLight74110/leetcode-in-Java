public class Solution {
	public static String longestCommonPrefix2(String[] strs) {
		if (strs.length == 0)
			return "";
		for (int j = 0; j < strs[0].length(); j++) {
			for (int i = 1; i < strs.length; i++) {
				if (strs[i].length() <= j
						|| strs[i].charAt(j) != strs[0].charAt(j))
					return strs[0].substring(0, j);
			}
		}
		return strs[0];
	}

	public static String longestCommonPrefix(String[] strs) {
		int len = strs.length;
		if (len == 0)
			return "";
		if (len == 1)
			return strs[0];
		int i = 1;
		String rs = strs[0];
		while (i < len) {
			int minLen = Math.min(rs.length(), strs[i].length());
			if (minLen == 0)
				return "";
			int j = 0;
			while (j < minLen) {
				if (rs.charAt(j) == strs[i].charAt(j)) {
					j++;
				} else {
					break;
				}
			}
			rs = rs.substring(0, j);
			i++;
		}
		return rs;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestCommonPrefix(new String[] { "abcd", "a",
				"abc", "ab" }));
		
		System.out.println("123".substring(0, 0)+"nima");
	}

}
