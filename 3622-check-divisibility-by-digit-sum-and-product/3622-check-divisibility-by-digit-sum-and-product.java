class Solution {
    public boolean checkDivisibility(int n) {
        int dsum = 0;
        int dp = 1;
        int temp = n;
        while(n>0){
            int digit = n%10;
            dsum+=digit;
            dp*=digit;
            n/=10;
        }
        if(temp%(dsum+dp)==0) return true;
        else return false;
    }
}