class Solution {
    public int findDuplicate(int[] nums) {
        boolean arr[]= new boolean[nums.length+1];
        for(int x:nums){
            if(arr[x]){
                return x;
            }
            arr[x]=true;
        }
        return -1;
    }
}