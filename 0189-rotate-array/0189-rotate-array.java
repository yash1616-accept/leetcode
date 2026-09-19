class Solution {
    public void revarr(int arr[],int start,int end){
        while(start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;

        revarr(nums,0,n-1);
        revarr(nums,0,k-1);
        revarr(nums,k,n-1);
        // int n= nums.length;
        // while(k>0){
        //     int last=nums[n-1];
        //     for(int i =n-1;i>0;i--){
        //         nums[i]=nums[i-1];

        //     }
        //     nums[0]=last;
        //     k--;

        // }
    }
}