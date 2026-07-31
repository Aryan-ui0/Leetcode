class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch-'a']++;
        }
        int res = 0;
        int count = 0;
        int push = 1;
        Arrays.sort(freq);
        for(int i = 25;i>=0;i--){
            if(freq[i]==0) break;
            res+=freq[i]*push;
            count++;
            if(count%8==0){
                push++;
            }
        }
        return res;

    }
}