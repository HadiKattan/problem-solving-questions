import java.util.Arrays;

class MaxOperations {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1, res = 0;

        while (i < j) {
            if (nums[i] + nums[j] == k) {
                res++;
                nums[i] = Integer.MIN_VALUE;
                nums[j] = Integer.MIN_VALUE;
                i++;
                j--;
            } else if (nums[i] + nums[j] > k) {
                j--;
            } else
                i++;
        }
        return res;
    }
}