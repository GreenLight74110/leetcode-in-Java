import java.util.Arrays;

public class Solution {

    static class Pair implements Comparable<Pair> {
        int value, index;
        public Pair(int v, int id) {
            value = v;
            index = id;
        }

        public int compareTo(Pair b) {
            return this.value - b.value;
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        Pair[] pairs = new Pair[numbers.length];

        // get pairs and sort
        for (int i = 0; i < numbers.length; ++i) {
            pairs[i] = new Pair(numbers[i], i + 1);
        }
        Arrays.sort(pairs);

        // two points
        int left = 0, right = numbers.length - 1, sum = 0;
        while (left < right) {
            sum = pairs[left].value + pairs[right].value;
            if (sum == target) {
                res[0] = pairs[left].index;
                res[1] = pairs[right].index;
                if (res[0] > res[1]) {
                    // swap them
                    res[0] ^= res[1];
                    res[1] ^= res[0];
                    res[0] ^= res[1];
                }
                break;
            } else if (sum > target) {
                --right;
            } else {
                ++left;
            }
        }

        return res;
    }
}