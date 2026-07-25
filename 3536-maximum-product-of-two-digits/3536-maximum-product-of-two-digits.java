class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(n>0){
            int digit = n%10;
            arr.add(digit);
            n/=10;
        }
        if(arr.size()==2) return arr.get(0)*arr.get(1);
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int num : arr){
            if(num>first){
                sec = first;
                first = num;
            } 
            else if(num>sec) sec = num;
        }
        return first*sec;
    }
}