class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
       int first=nums[nums.length-1]; 
       int second=nums[nums.length-2]; 
       int third=nums[nums.length-3];
       int product1= first*second*third;
       int product = nums[0]*nums[1]*nums[nums.length-1];
       return Math.max(product1,product);
    }
}