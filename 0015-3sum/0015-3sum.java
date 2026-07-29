class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            int l = i+1;
            int r = n-1;
            while(l<r){
                long sum = (long)nums[i] + nums[l] + nums[r];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l-1]==nums[l]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r+1]){
                        r--;
                    }
                }
                else if(sum>0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return res;
    }
}