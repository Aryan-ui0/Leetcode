class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        if(k==nums.length){
            int max2 = Integer.MIN_VALUE;
            for(int num: nums){
                max2 = Math.max(max2,num);
            }
            return max2;
        }
        if(k==1){
            
            int max = -1;
            
            for(int num: nums){
                if(map.get(num)==1 && num>max) max = num;
            }
            return max;
        }
        int n = nums.length -1;
        if (nums[0] == nums[n]) {
            return -1;
        }

        if (map.get(nums[0]) == 1 && map.get(nums[n]) == 1) {
            return Math.max(nums[0], nums[n]);
        }

        if (map.get(nums[0]) == 1 && map.get(nums[n]) > 1) {
            return nums[0];
        }

        if (map.get(nums[n]) == 1 && map.get(nums[0]) > 1) {
            return nums[n];
        }
        return -1;

    }
}