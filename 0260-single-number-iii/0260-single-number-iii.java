class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int i =0;
        int ans[]= new int [2];
        for(int x : map.keySet()){
        if(map.get(x)==1){
            ans[i++]=x;
        }
        }
        return ans ;
    }
}