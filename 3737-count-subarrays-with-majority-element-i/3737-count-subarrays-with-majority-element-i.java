class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int num = 0;
        for(int i =0;i<nums.length;i++){
            int count =0;
            int len =0;
            for(int j  =i;j<nums.length;j++){
                len = j-i+1;

            if(nums[j]==target) count++;
            if(count>len/2) num++;

            }

        }
        return num;
    }
}