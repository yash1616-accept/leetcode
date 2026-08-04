class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int min=nums[0];
        int max=nums[0];
        for(int x:nums){
            set.add(x);
           min=Math.min(min,x);
           max = Math.max(max,x);
        }
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
       
    }
}