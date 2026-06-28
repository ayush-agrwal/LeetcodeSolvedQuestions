class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] != 0) { // 1
                int t = nums[i]; //1
                nums[i] = nums[k];
                nums[k++] = t;
            }
        }
    }
}