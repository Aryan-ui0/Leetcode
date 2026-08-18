class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums,curr,used);
        return res;
    }
    private void backtrack(int[] nums,List<Integer> curr,boolean[] used){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
        }
        for(int i =0;i<nums.length;i++){
            if(used[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
            curr.add(nums[i]);
            used[i] = true;
            backtrack(nums,curr,used);

            used[i] = false;
            curr.remove(curr.size()-1);
        }
    }
}