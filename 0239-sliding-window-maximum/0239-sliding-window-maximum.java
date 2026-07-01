class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        TreeMap<Integer, Integer> map = new TreeMap<>();

        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int idx = 0;

        for (int i = 0; i < n; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (i >= k) {
                map.put(nums[i - k], map.get(nums[i - k]) - 1);

                if (map.get(nums[i - k]) == 0) {
                    map.remove(nums[i - k]);
                }
            }

            if (i >= k - 1) {
                ans[idx++] = map.lastKey();
            }
        }

        return ans;
    }
}