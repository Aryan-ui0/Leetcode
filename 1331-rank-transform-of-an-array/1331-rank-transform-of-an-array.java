class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        int[] temp = Arrays.copyOf(arr,n);
        int[] res = new int[n];
        Arrays.sort(temp);
        for(int i =0;i<n;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],rank++);
            }
        }

        for(int i = 0;i<n;i++){
            res[i] = map.get(arr[i]) ;
        }
        return res;
    }
}