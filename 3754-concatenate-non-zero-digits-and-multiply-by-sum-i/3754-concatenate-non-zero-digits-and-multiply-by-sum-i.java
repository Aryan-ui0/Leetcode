class Solution {
    public long sumAndMultiply(int n) {
        long sum =0;
        long newr = 0;
        while(n>0){
            int digit = n%10;
            if(digit!=0){
                sum+=digit;
                newr = newr*10 + digit;
            }
            n = n/10;
        }
        long newd = 0;
        while(newr>0){
            int digit = (int)(newr%10);
            newd = newd*10 + digit;
            newr /= 10;
        }
        return sum* newd;
    }
}