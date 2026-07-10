class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = nums.length -1;
        int[] res = new int[n];
        int idx = n-1;
        while(left<=right){
            int leftm = nums[left] * nums[left];
            int rightm = nums[right] * nums[right];
            if(leftm>rightm){
                res[idx--] = leftm;
                left++;
            }
            else {
                res[idx--] = rightm;
                right--;
            }
        }
        return res;
    }
}