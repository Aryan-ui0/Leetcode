class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for(int curr : nums){
            if(first>=curr){
                first= curr;
            }
            else if(sec>=curr){
                sec = curr;
            }
            else return true;

        }
        return false;
    }
}