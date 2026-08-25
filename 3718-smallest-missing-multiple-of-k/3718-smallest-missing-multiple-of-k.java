class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int temp = 1;
        while(true){
            if(temp%k==0 && !set.contains(temp)){
                return temp;
            }
            temp++;
        }
    }
}