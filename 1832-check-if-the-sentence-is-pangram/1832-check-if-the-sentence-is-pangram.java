class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        int arr[] = new int[26];
        for(int i =0;i<n;i++){
            char ch = sentence.charAt(i);
            arr[ch-'a'] = 1;
        }
        for(int num : arr){
            if(num==0) return false;
        }
        return true;
    }

}