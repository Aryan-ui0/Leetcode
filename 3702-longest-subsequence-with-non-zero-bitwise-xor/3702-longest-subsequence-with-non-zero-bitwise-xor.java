class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean hasnz = false;
        for(int num : nums){
            xor ^= num;

            if(num!=0) hasnz = true;
        }
        if(xor!=0) return nums.length;
        if(hasnz) return nums.length -1;
        return 0;
    }
}