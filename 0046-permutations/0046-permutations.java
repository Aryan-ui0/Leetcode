class Solution {
    List<List<Integer>> res = new ArrayList<>();
    private void backtrack(int[] nums,boolean[] check,int index,List<Integer> curr){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i =index;i<nums.length;i++){
            if(check[i]) continue;
            check[i] = true;
            curr.add(nums[i]);
            backtrack(nums,check,0,curr);
            check[i] = false;
            curr.remove(curr.size()-1);

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean[] check = new boolean[nums.length];
        List<Integer> curr = new ArrayList<>();
        backtrack(nums,check,0,curr);
        return res;
    }
}