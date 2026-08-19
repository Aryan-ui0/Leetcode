class Solution {
    List<List<String>> res = new ArrayList<>();
    private boolean ispal(String s){
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
    private void backtrack(String s,int start,List<String> curr){
        if(start==s.length()){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start;i<s.length();i++){
            String sub = s.substring(start,i+1);
            if(ispal(sub)){
                curr.add(sub);
                backtrack(s,i+1,curr);
                curr.remove(curr.size()-1);
            }
            

        }
    }
    public List<List<String>> partition(String s) {
        List<String> curr = new ArrayList<>();
        backtrack(s,0,curr);
        return res;
    }
}