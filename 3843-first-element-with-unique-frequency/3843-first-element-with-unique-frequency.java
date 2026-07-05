class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> elem = new HashMap<>();
        HashMap<Integer,Integer> freq = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
            elem.put(num,elem.getOrDefault(num,0)+1);
        }
        int unique = -1;
        for(int num : elem.values()){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int num : nums){
            int f= elem.get(num);
            if(freq.get(f)==1) return num;
        }
        return -1;
    }
}