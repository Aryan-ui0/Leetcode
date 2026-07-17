class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int temp =1;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(n%temp==0){
                sum = sum + nums[i]*nums[i];
                
            } 
            temp++;
        }
        return sum;
    }
}