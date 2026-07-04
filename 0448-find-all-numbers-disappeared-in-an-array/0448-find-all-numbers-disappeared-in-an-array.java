class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = nums.length;
        HashSet<Integer> st = new HashSet<>();
        for(int num : nums){
            st.add(num);
        }
        for(int i =1;i<=n;i++){
            if(!st.contains(i)){
                res.add(i);
            }
  
        }
        return res;
    }
}