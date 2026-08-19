class Solution {
    List<List<Integer>> res = new ArrayList<>();
    private void backtrack(int[] candidates,int target,List<Integer> curr,int start){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        } 
        if(target<0) return;
        for(int i = start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]) continue;
            curr.add(candidates[i]);
            backtrack(candidates,target-candidates[i],curr,i+1);

            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> curr = new ArrayList<>();
        backtrack(candidates,target,curr,0);
        return res;
    }
}