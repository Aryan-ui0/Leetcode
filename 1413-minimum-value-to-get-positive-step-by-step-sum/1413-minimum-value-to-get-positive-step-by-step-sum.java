class Solution {
    public int minStartValue(int[] nums) {
        int minp = 0;
        int p =0;
        for(int i =0;i<nums.length;i++){
            p+=nums[i];
            minp = Math.min(minp,p);
        }
        if(minp>0) return nums[0];
        return Math.abs(minp) +1;
    }
}