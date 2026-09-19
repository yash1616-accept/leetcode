class Solution {
    public int missingNumber(int[] nums) {
       Arrays.sort(nums);
       int missingnum=0;
       for(int i =0;i<nums.length-1;i++){
        if(nums[i]+1==nums[i+1]){
            continue;
        }else {
             missingnum = nums[i]+1;
             return missingnum;
        }
       } 
       if (nums[nums.length-1]!=nums.length){
            missingnum=nums[nums.length-1]+1;
            return nums.length;
        }
       return missingnum;
    }
}