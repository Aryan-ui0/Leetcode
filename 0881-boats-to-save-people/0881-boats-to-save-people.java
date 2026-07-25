class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats  = 0;
        Arrays.sort(people);
        int n = people.length;
        int l = 0;
        int r = n-1;
        while(l<=r){
            if(l==r){
                boats++;
                break;
            } 
            int sum = people[l] + people[r];
            if(sum==limit){
                boats++;
                l++;
                r--;
            }
            else if(sum<limit){
                boats++;
                l++;
                r--;
            }
            else{
                boats++;
                r--;
            }
        }
        return boats;
    }
}