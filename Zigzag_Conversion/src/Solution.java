import java.util.Arrays;

public class Solution {

	public static String convert(String s, int nRows) {
		int len = s.length();
		if (len == 0 || nRows < 2)
			return s;

		String[] ans = new String[nRows];
		Arrays.fill(ans, "");

		// row为当前行数，sign的正负标记上下方向
		int row = 0, sign = 1;
		for (int i = 0; i < len; i++) {
			ans[row] += s.charAt(i);
			row += sign;
			if (row > nRows - 1) {
				row = nRows - 2;
				sign = -1;
			}
			if (row < 0) {
				row = 1;
				sign = 1;
			}
		}

		s = "";
		for (int i = 0; i < nRows; i++) {
			s += ans[i];
		}
		return s;
	}

	public static String convert2(String s, int numRows) {
		int len = s.length();
		if (len == 0 || numRows < 2) {
			return s;
		}
		
		String res = "";
		int priod = 2*numRows-2;
		for(int i=0;i<numRows;i++){
			for(int j=i;j<len;j+=priod){
				res += s.charAt(j);
				if(i>0 && i<numRows-1){
					int t = priod-2*i+j;
					if(t<len)
						res += s.charAt(t);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert2("PAYPALISHIRING", 3));
	}

}
