class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int count = 0;
        int res =Integer.MIN_VALUE;
        for(int r = 0;r<n;r++){
            if(nums[r]==0) count++;
            while(count>k){
                if(nums[l]==0){
                    count--;
                }
                l++;
            }
            int temp = r-l+1;
            res = Math.max(res,temp);
        }
        return res;

    }
}