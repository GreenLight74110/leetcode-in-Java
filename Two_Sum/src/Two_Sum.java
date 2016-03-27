import java.util.Arrays;

public class Two_Sum {
	static class Pair implements Comparable<Pair> {

		int value, index;

		public Pair(int v, int i) {
			this.value = v;
			this.index = i;
		}

		public int compareTo(Pair p) {
			// TODO Auto-generated method stub
			return this.value - p.value;
		}
	}

	public static int[] twoSum1(int[] nums, int target) {
		int[] res = new int[2];
		Pair[] pairs = new Pair[nums.length];

		// 填充pairs并排序
		for (int i = 0; i < nums.length; i++) {
			pairs[i] = new Pair(nums[i], i);
		}
		Arrays.sort(pairs);

		// 取前后两个点，逼近
		int left = 0, right = nums.length - 1, sum = 0;
		while (left < right) {
			sum = pairs[left].value + pairs[right].value;
			if(sum==target){
				res[0] = pairs[left].index;
				res[1] = pairs[right].index;
				break;
			}else if(sum>target){
				right--;
			}else{
				left++;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,2,3,4,5,6};
		int target = 4;
		
		System.out.println("hjhh");
		
		int[] res = Two_Sum.twoSum1(nums,target);
		
		for (int i : res) {
			System.out.print(i+",");
		}
	}

}
