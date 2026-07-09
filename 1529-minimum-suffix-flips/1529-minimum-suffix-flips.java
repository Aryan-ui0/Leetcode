class Solution {
    public int minFlips(String target) {
        int count = 0;
        char prev = '0';
        for(char i : target.toCharArray()){
            if(i!=prev){
                count++;
                prev  = i;
            }
        }
        return count;
    }
}