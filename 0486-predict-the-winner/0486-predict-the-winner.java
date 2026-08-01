class Solution {

    public int solve(int[] nums, int l, int r) {
        if (l == r) {
            return nums[l];
        }

        int takeLeft = nums[l] - solve(nums, l + 1, r);
        int takeRight = nums[r] - solve(nums, l, r - 1);

        return Math.max(takeLeft, takeRight);
    }

    public boolean predictTheWinner(int[] nums) {
        return solve(nums, 0, nums.length - 1) >= 0;
    }
}