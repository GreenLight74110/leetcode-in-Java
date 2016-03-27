public class Solution {
	public static int removeDuplicates(int[] nums) {
		if (nums.length < 2)
			return nums.length;
		int index = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1])
				nums[index++] = nums[i];
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 2, 3, 3, 3, 4 };
		int num = removeDuplicates(nums);
		System.out.println(num);
//		for (int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
//		}
	}

}
