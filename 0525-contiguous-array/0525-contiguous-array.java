class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = 0;
        int prefix =0;
        map.put(0,-1);

        for(int i =0;i<nums.length;i++){
            int num = nums[i];
            if(num==0){
                prefix-=1;
            }


            else{
                prefix+=1;
            }

            if(map.containsKey(prefix)){
                int templen = Math.abs(map.get(prefix)-i);
                len = Math.max(len,templen);
            }
            else{
                map.put(prefix,i);

            }
        }
        return len;
    }
}