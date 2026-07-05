class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                temp++;
                count += temp;
            } else {
                temp = 0;
            }
        }

        return count;
    }
}