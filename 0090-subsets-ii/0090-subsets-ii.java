class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> curr = new ArrayList<>();
        backtrack(nums,curr,0);
        return res;
    }
    private void backtrack(int[] nums,List<Integer> curr,int index){
        res.add(new ArrayList<>(curr));
        for(int i = index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);
            backtrack(nums,curr,i+1);
            curr.remove(curr.size()-1);
        }
    }
}