class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int x :map.keySet()){
            if(map.get(x)>n/2){
                return x;
            }
        }
        return -1;
    }
}