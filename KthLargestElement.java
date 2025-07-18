class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
        }
        int j = nums.length - k;
        while (!q.isEmpty() && j >= 0) {
            res = q.poll();
            j--;
        }
        return res;
    }
}