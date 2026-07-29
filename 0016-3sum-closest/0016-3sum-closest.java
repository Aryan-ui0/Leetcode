class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int bestsum = 0;
        int bestdiff = Integer.MAX_VALUE;
        for(int i = 0;i<n-2;i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                int diff = Math.abs(target-sum);
                if(bestdiff>diff){
                    bestdiff = diff;
                    bestsum = sum;
                }
                if(sum==target) return sum;
                else if(sum>target) r--;
                else l++;

            }
        }
        return bestsum;
    }
}