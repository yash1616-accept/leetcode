class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstidx = -1;
        int lastidx = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                firstidx = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;

            }
        }
            low = 0;
            high = nums.length - 1;
            while (low <= high) {
               int  mid = low + (high - low) / 2;
                if (nums[mid] == target) {
                    lastidx = mid;
                    low = mid + 1;
                } else if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
        

        return new int[] { firstidx, lastidx };
    }
}