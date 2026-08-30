class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int maxid = -1;
        int min = Integer.MAX_VALUE;
        int minid = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                maxid = i;
            }
            if(nums[i]<min){
                min = nums[i];
                minid = i;
            }
        }
        int left = Math.max(maxid,minid) +1;
        int right = n - Math.min(maxid,minid);
        int both = Math.min(maxid,minid) +1 + n - Math.max(minid, maxid);
        return Math.min(left, Math.min(right, both));
    }    

    
}