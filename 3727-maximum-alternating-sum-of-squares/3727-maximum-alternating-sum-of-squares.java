class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i]<0) nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long first = 0;
        for(int i =0;i<n/2;i++){
            first += (long)(nums[i]*nums[i]);
        }
        long sec = 0;
        for(int i =n/2;i<n;i++){
            sec += (long)(nums[i]*nums[i]);
        }
        return sec-first;
    }
}