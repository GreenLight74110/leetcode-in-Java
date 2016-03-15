import java.util.HashMap;

public class Solution2 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; ++i) {
            // add i-th number
            Integer a = nums.get(numbers[i]);
            if (a == null)
                nums.put(numbers[i], i);

            // find (target - numbers[i])
            a = nums.get(target - numbers[i]);
            if (a != null && a < i) {
                res[0] = a + 1;
                res[1] = i + 1;
                break;
            }
        }
        return res;
    }
}