class Solution {
    public int longestSubarray(int[] nums) {
        int zerocount = 0;
        int n = nums.length;
        int res = 0;
        int l = 0;
        if(n==0) return 0;
        for(int r = 0;r<n;r++){
            int temp = 0;
            if(nums[r]==0) zerocount++;
            while(zerocount>1){
                if(nums[l]==0){
                    zerocount--;
                }
                l++;
            }
            if(zerocount==1 || zerocount==0){
                temp = r-l;
            }
            res = Math.max(res,temp);
        }
        return res;
    }
}