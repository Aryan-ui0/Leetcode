class Solution {
    public int countvov(String s){
        int count =0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) count++;
        }
         
        return count;
    }
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int num = countvov(arr[0]);
        for(int i =1;i<arr.length;i++){
            String temp = arr[i];
            if(countvov(temp)==num){
                arr[i] = new StringBuilder(arr[i]).reverse().toString();
            }
        }
        return String.join(" ",arr);
        
    }
}