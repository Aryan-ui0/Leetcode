class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        String nums = "123456789";
        for(int i = 0;i<9;i++){
            for(int j = i+1;j<9;j++){
                String temp = nums.substring(i,j+1);
                int tempnum = Integer.parseInt(temp);
                if(tempnum>=low && tempnum<=high) {
                    res.add(tempnum);
                }
            }
        }
        Collections.sort(res);
        return res;
    }

}