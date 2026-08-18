class Solution {
    List<List<Integer>> res = new ArrayList<>();
    private void backtrack(int[] nums,boolean[] check,List<Integer> curr){
        if(nums.length==curr.size()){
            res.add(new ArrayList<>(curr));
        }
        for(int i = 0;i<nums.length;i++){
            if(check[i]) continue;
            check[i] = true;
            curr.add(nums[i]);
            backtrack(nums,check,curr);
            curr.remove(curr.size()-1);
            check[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[] check = new boolean[nums.length];
        backtrack(nums,check,new ArrayList<>());
        return res;
    }
}