class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int x:nums){
           set.add(x);
        }
        int index=0;
        for(int x:set){
            nums[index++]=x;
        }
        return set.size();
    }
}