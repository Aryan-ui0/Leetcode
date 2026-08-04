class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int min = nums[0];
        int max = nums[n-1];
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        } 
        return res;
    }
}