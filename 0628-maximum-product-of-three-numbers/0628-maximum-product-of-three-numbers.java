class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = nums[n-1];
        int smax = nums[n-2];
        int tmax = nums[n-3];
        int min = nums[0];
        int smin = nums[1];
        int product1 = max*smax*tmax;
        int product2 = min*smin*max;
        return Math.max(product1,product2);
    }
}