class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 1, tmp;
        while (j < nums.length) {
            if (nums[j] != 0 && nums[i] == 0) {
                tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
            if (nums[i] != 0)
                i++;
            j++;
        }
    }
}