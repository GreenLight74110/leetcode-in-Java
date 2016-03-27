public class Solution {
	public static boolean isValid(String s) {
		char[] ca = s.toCharArray();
		char[] left = new char[ca.length];
		int i = 0, j = 0;
		while (i < ca.length) {
			if (ca[i] == '(' || ca[i] == '{' || ca[i] == '[')
				left[j++] = ca[i];
			else if (j <= 0)
				return false;
			else {
				j--;
				switch (left[j]) {
				case '(':
					if (ca[i] != ')')
						return false;
					else
						left[j] = '\0';
					break;
				case '[':
					if (ca[i] != ']')
						return false;
					else
						left[j] = '\0';
					break;
				case '{':
					if (ca[i] != '}')
						return false;
					else
						left[j] = '\0';
					break;
				default:
					return false;
				}
			}

			i++;
		}
		return left[0] == '\0';
	}

	public static void main(String[] args) {
		char[] ca = { 'a', 'b' };
		char[] left = new char[ca.length];
		left[0] = ca[0];
		System.out.println(isValid("(((())))}}"));
	}
}
